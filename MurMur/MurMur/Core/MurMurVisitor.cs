using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using MurMur.Grammar;
using System;
using System.Collections.Generic;
using System.Text;

namespace MurMur
{
    internal class MurMurVisitor: MurMurParserBaseVisitor<MurMurVariable>
    {
        MurMurScript script;
        internal ParserRuleContext currentTree;

        public MurMurVisitor(MurMurScript script)
        {
            this.script = script;
        }

        public override MurMurVariable VisitMurmur([NotNull] MurMurParser.MurmurContext context)
        {
            script.Tags = new Dictionary<string, MurMurParser.BlockContext>();
            return base.VisitMurmur(context);
        }

        public override MurMurVariable VisitTag([NotNull] MurMurParser.TagContext context)
        {
            var name = context.TEXT().GetText();
            script.Tags[name] = context.block();

            return null;
        }

        public override MurMurVariable VisitText([NotNull] MurMurParser.TextContext context)
        {
            script.currentLine.Text += context.GetText();
            return base.VisitText(context);
        }

        public override MurMurVariable VisitTextLine([NotNull] MurMurParser.TextLineContext context)
        {
            script.currentLine = new MurMurLine()
            {
                Text = "",
                Context = context
            };
            base.VisitTextLine(context);

            script.currentLine.Text = script.currentLine.Text.TrimStart(' ', '\t');
            return new MurMurVariable()
            {
                Halt = context
            };
        }

        public override MurMurVariable VisitCommand([NotNull] MurMurParser.CommandContext context)
        {
            var commandId = context.WORD().GetText();

            if (commandId.ToLower()=="goto")
            {
                var target = Visit(context.@params().expression(0)).Text;
                return Visit(script.Tags[target]);
            }

            return null;
        }

        private MurMurVariable Halt(ParserRuleContext context = null)
        {
            return new MurMurVariable()
            {
                Halt = context
            };
        }

        public override MurMurVariable VisitStringExpression([NotNull] MurMurParser.StringExpressionContext context)
        {
            return new MurMurVariable()
            {
                Text = context.STRING().GetText()
            };
        }

        protected override bool ShouldVisitNextChild([NotNull] IRuleNode node, MurMurVariable currentResult)
        {
            if (currentResult!=null && currentResult.Halt !=null)
            {
                currentTree = currentResult.Halt;
                return false;
            }

            currentTree = null;
            return base.ShouldVisitNextChild(node, currentResult);
        }

        internal void Resume()
        {
            var parentTree = new ParserRuleContext();
            var originalParent = currentTree.Parent as ParserRuleContext;
            parentTree.CopyFrom(originalParent);
            parentTree.children.Clear();
            foreach (var c in originalParent.children)
            {
                parentTree.children.Add(c);
            }
            if (currentTree != null)
            {
                
                int removeCount = (currentTree.Parent as ParserRuleContext).children.IndexOf(currentTree);
                for (int i = 0; i <= removeCount; i++)
                {
                    parentTree.children.RemoveAt(0);
                }
                currentTree = null;
                Visit(parentTree);
            }
        }
    }
}
