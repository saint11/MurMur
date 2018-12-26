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

        internal List<MurMurParser.MenuSubBlockContext> availableOptions;

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
                script.CurrentLine.Text += txt;
                return new MurMurVariable(txt);
            }

            var command = context.command();
            if (command != null)
            {
                var txt = Visit(command.expression());
                if (txt.Type == MurMurVariable.MurMurType.Text)
                    script.CurrentLine.Text += txt.Text;
                else if (txt.Type == MurMurVariable.MurMurType.Number)
                    script.CurrentLine.Text += txt.Number.ToString();
                else if (txt.Type == MurMurVariable.MurMurType.Boolean)
                    script.CurrentLine.Text += txt.Boolean.ToString();
                    
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
            script.CurrentLine = new MurMurLine()
            {
                Type = MurMurLineType.text,
                Text = "",
            };
            base.VisitLine(context);
            if (script.CurrentLine != null)
                script.CurrentLine.Text = script.CurrentLine.Text.TrimStart(' ', '\t');

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
                script.CurrentLine = new MurMurLine()
                {
                    Type = MurMurLineType.menu,
                    Text = ""
                };

                var expression = context.menuCommand().expression();
                if (expression != null)
                {
                    script.CurrentLine.Text = Visit(expression).Text;
                }

                List<string> options = new List<string>();
                availableOptions = new List<MurMurParser.MenuSubBlockContext>();
                foreach (var item in context.menuSubBlock())
                {
                    var condition = item.menuOptionCommand().expression()[1];
                    if (condition == null || Visit(condition).Boolean)
                    {
                        options.Add(Visit(item.menuOptionCommand().expression()[0]).Text);
                        availableOptions.Add(item);
                    }
                }
                script.CurrentLine.OptionsText = options.ToArray();
                currentStack.Push(context);

                return new MurMurVariable()
                {
                    Halt = context
                };
            }
            else // We've been here before, let's run a submenu block
            {
                var block = availableOptions[lastChoice];
                availableOptions = null;
                lastChoice = -1;

                
                if (block.block() != null)
                {
                    return Visit(block.block());
                }
                else // Empty menu subblock, let's skip ahead
                {
                    script.CurrentLine = new MurMurLine()
                    {
                        Type = MurMurLineType.empty,
                    };

                    return new MurMurVariable();
                }
            }

        }

        public override MurMurVariable VisitMethodOrVariableExpression([NotNull] MurMurParser.MethodOrVariableExpressionContext context)
        {
            var name = context.WORD().GetText();
            var variable = FindVariable(name, context.start.Line);

            if (variable.HasValue())
                return variable;

            return Invoke(name, context.start.Line);
        }

        public override MurMurVariable VisitMethodExpression([NotNull] MurMurParser.MethodExpressionContext context)
        {
            var name = context.WORD().GetText();

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

            if (script.Globals.ContainsKey(name))
                try
                {
                    return Invoke(name, context.start.Line, parameters);
                }
                catch (Exception e)
                {
                    throw new MurMurException(string.Format("Method {0} failed with the message: {1}",name, e.Message), context.start.Line);
                }
            else
                throw new MurMurException(string.Format("Couldn't find any variable or method called {0}", name), context.start.Line);
        }

        public MurMurVariable FindVariable(string name, int line)
        {
            if (script.Globals.ContainsKey(name))
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

                throw new MurMurException("Unknown variable type (" + name + ")", line);
            }
            else if (script.UnsafeMode)
                return new MurMurVariable("??" + name + "??");
            else
                throw new MurMurException("Could not find variable " + name, line);
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

            if (script.UnsafeMode)
                return new MurMurVariable("??" + function + "??");
            else
                throw new MurMurException("Unknown method type (" + function + ")", line);
        }

        public override MurMurVariable VisitAssignExpression([NotNull] MurMurParser.AssignExpressionContext context)
        {
            var value = Visit(context.expression());
            script.Globals[context.WORD().GetText()] = value;
            return value;
        }

        public override MurMurVariable VisitComparissonExpression([NotNull] MurMurParser.ComparissonExpressionContext context)
        {
            var signal = context.COMPARISSON_SIGNAL().GetText();
            if (signal == "==")
                return new MurMurVariable(Visit(context.expression()[0]) == Visit(context.expression()[1]));
            else if (signal == "!=")
                return new MurMurVariable(Visit(context.expression()[0]) != Visit(context.expression()[1]));
            else
                throw new MurMurException(string.Format("Unknown comparisson signal '{0}'", signal), context.start.Line);
        }

        #region Operations And Values

        public override MurMurVariable VisitPriorityExpression([NotNull] MurMurParser.PriorityExpressionContext context)
        {
            return Visit(context.expression());
        }

        public override MurMurVariable VisitAdditiveExpression([NotNull] MurMurParser.AdditiveExpressionContext context)
        {
            var values = context.expression();
            var a = Visit(values[0]);
            var b = Visit(values[1]);

            return AddValues(a, b);
        }

        private static MurMurVariable AddValues(MurMurVariable a, MurMurVariable b)
        {
            if (a.Type == MurMurVariable.MurMurType.Text && b.Type == MurMurVariable.MurMurType.Text)
            {
                return new MurMurVariable(a.Text + b.Text);
            }
            else if (a.Type == MurMurVariable.MurMurType.Number && b.Type == MurMurVariable.MurMurType.Text)
            {
                return new MurMurVariable(a.Number.ToString() + b.Text);
            }
            else if (a.Type == MurMurVariable.MurMurType.Text && b.Type == MurMurVariable.MurMurType.Number)
            {
                return new MurMurVariable(a.Text + b.Number.ToString());
            }
            else if (a.Type == MurMurVariable.MurMurType.Number && b.Type == MurMurVariable.MurMurType.Number)
            {
                return new MurMurVariable(a.Number + b.Number);
            }

            throw new Exception(string.Format("Cannot add {0} and {1}", a.ToString(), b.ToString()));
        }


        public override MurMurVariable VisitBooleanExpression([NotNull] MurMurParser.BooleanExpressionContext context)
        {
            return new MurMurVariable(context.TRUE() != null);
        }

        public override MurMurVariable VisitString([NotNull] MurMurParser.StringContext context)
        {
            string text = context.STRING().GetText();
            return new MurMurVariable(text);
        }

        public override MurMurVariable VisitNumberExpression([NotNull] MurMurParser.NumberExpressionContext context)
        {
            string text = context.GetText();
            if (float.TryParse(text, out float value))
                return new MurMurVariable(value);
            else
                throw new MurMurException("Cannot parse " + text + "into a float", context.start.Line);
        }

        #endregion

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
