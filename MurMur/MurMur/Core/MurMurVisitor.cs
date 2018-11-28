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
        internal Stack<ParserRuleContext> currentStack;

        int lastChoice = -1;

        public MurMurVisitor(MurMurScript script)
        {
            currentStack = new Stack<ParserRuleContext>();
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

            return new MurMurVariable();
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
                if (txt.HasValue())
                    script.currentLine.Text += txt.Text;
                return txt;
            }

            var inlineIf = context.inlineIfBlock();
            if (inlineIf != null)
            {
                var txt = Visit(inlineIf);
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
            if (script.currentLine != null)
                script.currentLine.Text = script.currentLine.Text.TrimStart(' ', '\t');

            return new MurMurVariable()
            {
                Halt = context
            };
        }

        public override MurMurVariable VisitInlineIfBlock([NotNull] MurMurParser.InlineIfBlockContext context)
        {
            var expression = context.ifCommand().expression();

            var result = Visit(expression);
            if (result.Boolean)
            {
                currentStack.Push(context);
                var txt = "";
                foreach (var fragment in context.inlineIfTrueFragment().lineFragment())
                {
                    txt += Visit(fragment).Text;
                }

                return new MurMurVariable(txt);
            }
            else if (context.elseCommand() != null) 
            {
                currentStack.Push(context);
                var txt = "";
                foreach (var fragment in context.inlineIfFalseFragment().lineFragment())
                {
                    txt += Visit(fragment).Text;
                }

                return new MurMurVariable(txt);
            }
            return new MurMurVariable();
        }

        public override MurMurVariable VisitIfBlock([NotNull] MurMurParser.IfBlockContext context)
        {
            var expression = context.ifCommand().expression();

            var result = Visit(expression);
            if (result.Boolean)
            {
                currentStack.Push(context);
                Visit(context.block()[0]);
            }
            else if (context.elseCommand() != null)
            {
                currentStack.Push(context);
                Visit(context.block()[1]);
            }

            return new MurMurVariable();
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

                currentStack.Push(context);

                return Visit(block);
            }

        }

        public override MurMurVariable VisitCommand([NotNull] MurMurParser.CommandContext context)
        {
            var name = context.WORD().GetText();
            var variable = VisitVariable(name);

            if (variable.HasValue())
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
            return Invoke(name, context.start.Line, parameters);
        }

        public MurMurVariable VisitVariable(string name)
        {
            var value = script.Globals[name];
            if (value is MurMurVariable)
                return (MurMurVariable)value;

            if (value is string)
                return new MurMurVariable(value as string);

            if (value is int)
                return new MurMurVariable((int)value);

            if (value is float)
                return new MurMurVariable((float)value);

            //TODO: Should display error
            return new MurMurVariable();
        }

        internal MurMurVariable Invoke(string function, int line, params MurMurVariable[] parameters)
        {
            var method = script.Globals[function];
            if (method == null)
                    throw new MurMurException("Null method or variable (" + function + ")", line);
            
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
                return new MurMurVariable();
            }

            if (method is Action<string>)
            {
                (method as Action<string>).Invoke(parameters[0].Text);
                return new MurMurVariable();
            }

            if (method is Action<float>)
            {
                (method as Action<float>).Invoke(parameters[0].Number);
                return new MurMurVariable();
            }

            if (method is Action<int>)
            {
                (method as Action<int>).Invoke((int)parameters[0].Number);
                return new MurMurVariable();
            }

            throw new MurMurException("Unknown method type (" + function + ")", line);
        }
        
        public override MurMurVariable VisitComparissonExpression([NotNull] MurMurParser.ComparissonExpressionContext context)
        {
            return new MurMurVariable(Visit(context.expression()[0]) == Visit(context.expression()[1]));
        }

        public override MurMurVariable VisitBooleanExpression([NotNull] MurMurParser.BooleanExpressionContext context)
        {
            return new MurMurVariable(context.TRUE() != null);
        }

        public override MurMurVariable VisitVariableExpression([NotNull] MurMurParser.VariableExpressionContext context)
        {
            var variable = script.Globals[context.WORD().GetText()];
            if (variable is MurMurVariable)
                return (MurMurVariable)variable;

            return new MurMurVariable();
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
            if (currentResult.Halt != null)
            {
                currentStack.Push(currentResult.Halt);
                return false;
            }
            else
            {
                return base.ShouldVisitNextChild(node, currentResult);
            }
        }

        internal void ResumeMenu(int choice)
        {
            lastChoice = choice;
            
            Visit(currentStack.Pop());
        }

        internal void Resume()
        {
            var parentTree = new ParserRuleContext();
            var lastTree = currentStack.Pop();
            var originalParent = lastTree.Parent as ParserRuleContext;

            parentTree.CopyFrom(originalParent);
            parentTree.children.Clear();

            foreach (var c in originalParent.children)
            {
                parentTree.children.Add(c);
            }

            if (currentStack != null)
            {
                int removeCount = originalParent.children.IndexOf(lastTree);

                for (int i = 0; i <= removeCount; i++)
                {
                    parentTree.children.RemoveAt(0);
                }

                Visit(parentTree);
                
            }
        }
    }
}
