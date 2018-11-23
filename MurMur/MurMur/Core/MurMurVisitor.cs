using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using MurMur.Grammar;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Text;

namespace MurMur
{
    internal class MurMurVisitor: MurMurParserBaseVisitor<MurMurVariable>
    {
        MurMurScript script;
        internal ParserRuleContext currentTree;

        int lastChoice = -1;

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

        public override MurMurVariable VisitLineFragment([NotNull] MurMurParser.LineFragmentContext context)
        {
            var raw = context.TEXT();
            if (raw != null)
            {
                var txt = raw.GetText();
                script.currentLine.Text += txt;
                return new MurMurVariable(txt);
            }

            var command = context.command();
            if (command != null)
            {
                var txt = Visit(command);
                script.currentLine.Text += txt.Text;
                return txt;
            }

            throw new MurMurException("Unknown line fragment type.", context.Start.Line);
        }
        
        public override MurMurVariable VisitLine([NotNull] MurMurParser.LineContext context)
        {

            script.currentLine = new MurMurLine()
            {
                Type = MurMurLineType.text,
                Text = "",
            };
            base.VisitLine(context);
            script.currentLine.Text = script.currentLine.Text.TrimStart(' ', '\t');

            return new MurMurVariable()
            {
                Halt = context
            };
        }

        public override MurMurVariable VisitMenuBlock([NotNull] MurMurParser.MenuBlockContext context)
        {
            if (lastChoice == -1) // never visited this menu
            {
                script.currentLine = new MurMurLine()
                {
                    Type = MurMurLineType.menu,
                    Text = ""
                };

                var expression = context.menuCommand().expression();
                if (expression != null)
                {
                    script.currentLine.Text = Visit(expression).Text;
                }

                List<string> options = new List<string>();
                foreach (var item in context.menuSubBlock())
                {
                    options.Add(Visit(item.menuOptionCommand().expression()).Text);
                }
                script.currentLine.OptionsText = options.ToArray();

                return new MurMurVariable()

                {
                    Halt = context
                };
            }
            else // We've been here before, let's run a submenu block
            {
                var blocks = context.menuSubBlock(); 
                var block = blocks[lastChoice];
                lastChoice = -1;
                Visit(block);

                currentTree = context;

                return null;
            }

        }

        public override MurMurVariable VisitCommand([NotNull] MurMurParser.CommandContext context)
        {
            var name = context.WORD().GetText();
            var variable = VisitVariable(name);

            if (variable != null)
                return variable;

            var paramContexts = context.@params()?.expression();
            MurMurVariable[] parameters = null;

            if (paramContexts != null)
            {
                parameters = new MurMurVariable[paramContexts.Length];
                for (int i = 0; i < parameters.Length; i++)
                {
                    parameters[i] = Visit(paramContexts[i]);
                }
            }
            return Invoke(name, parameters);
        }

        public MurMurVariable VisitVariable(string name)
        {
            var value = script.Globals[name];
            if (value is MurMurVariable)
                return value as MurMurVariable;

            if (value is string)
                return new MurMurVariable(value as string);

            if (value is int)
                return new MurMurVariable((int)value);

            if (value is float)
                return new MurMurVariable((float)value);

            //TODO: Should display error
            return null;
        }

        internal MurMurVariable Invoke(string function, params MurMurVariable[] parameters)
        {
            var method = script.Globals[function];
            Debug.Assert(method != null, "Null method or variable (" + function + ")");
            
            if (method is Func<MurMurVariable>)
            {
                return (method as Func<MurMurVariable>).Invoke();
            }

            if (method is Func<MurMurVariable, MurMurVariable>)
            {
                return (method as Func<MurMurVariable, MurMurVariable>).Invoke(parameters[0]);
            }

            if (method is Func<MurMurVariable, MurMurVariable, MurMurVariable>)
            {
                return (method as Func<MurMurVariable, MurMurVariable, MurMurVariable>).Invoke(parameters[0], parameters[0]);
            }

            if (method is Action<MurMurVariable>)
            {
                (method as Action<MurMurVariable>).Invoke(parameters[0]);
            }

            if (method is Action<string>)
            {
                (method as Action<string>).Invoke(parameters[0].Text);
            }

            if (method is Action<float>)
            {
                (method as Action<float>).Invoke(parameters[0].Number);
            }

            if (method is Action<int>)
            {
                (method as Action<int>).Invoke((int)parameters[0].Number);
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
            if (currentResult != null && currentResult.Halt != null)
            {
                currentTree = currentResult.Halt;
                return false;
            }
            else
            {
                currentTree = null;
                return base.ShouldVisitNextChild(node, currentResult);
            }
        }

        internal void ResumeMenu(int choice)
        {
            lastChoice = choice;
            
            Visit(currentTree);
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
