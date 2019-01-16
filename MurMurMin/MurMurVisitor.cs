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

            // First we create the methods block
            foreach (var method in context.defBlock())
            {
                var words = method.WORD();
                var name = words[0].GetText();
                if (name == "init")
                {
                    Visit(method);
                }
                else
                {
                    script.Globals[name] = (Func<MurMurVariable[], MurMurVariable>)((parameters) =>
                    {
                        for (int i = 1; i < words.Length; i++)
                        {
                            script.Locals[words[i].GetText()] = parameters[i - 1];
                        }
                        var value = Visit(method);
                        script.Locals.Clear();
                        return value;
                    });
                }
            }

            // Then we collect the tags
            var tags = context.tag();
            foreach (var tag in tags)
            {
                VisitTag(tag);
            }

            return new MurMurVariable();
        }

        public override MurMurVariable VisitTag([NotNull] MurMurParser.TagContext context)
        {
            var name = context.TEXT().GetText();
            script.Tags[name] = context.block();

            return new MurMurVariable();
        }

        public override MurMurVariable VisitDeclaration([NotNull] MurMurParser.DeclarationContext context)
        {
            script.AppendFile(Visit(context.@string()).ToString());
            return new MurMurVariable();
        }

        public override MurMurVariable VisitLineFragment([NotNull] MurMurParser.LineFragmentContext context)
        {
            var raw = context.TEXT();
            if (raw != null)
            {
                var txt = raw.GetText();
                script.CurrentLine.Text += txt;
                return new MurMurVariable();
            }

            var simpleCommand = context.simpleCommand();
            if (simpleCommand != null)
            {
                var txt = Visit(simpleCommand.expression());
                if (txt.HasValue())
                    script.CurrentLine.Text += txt.ToString();

                return new MurMurVariable();
            }

            var multiCommand = context.multiLineCommand();
            if (multiCommand != null)
            {

                foreach (var expression in multiCommand.expression())
                {
                    var txt = Visit(expression);
                    if (txt.HasValue())
                        script.CurrentLine.Text += txt.ToString();
                }

                return new MurMurVariable();
            }

            var inlineIf = context.inlineIfBlock();
            if (inlineIf != null)
            {
                var txt = Visit(inlineIf);

                return new MurMurVariable();
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
                return VisitBlock(context.block()[0]);
            }
            else if (context.elseCommand() != null)
            {
                currentStack.Push(context);
                return VisitBlock(context.block()[1]);
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
                    var expressions = item.menuOptionCommand().expression();
                    bool shouldIncludeOption;
                    if (expressions.Length > 1) // Option has a condition
                    {
                        var condition = expressions[1];
                        shouldIncludeOption = (condition == null || Visit(condition).Boolean);
                    }
                    else // This option is always true
                    {
                        shouldIncludeOption = true;
                    }

                    options.Add(Visit(item.menuOptionCommand().expression()[0]).Text);
                    availableOptions.Add(item);
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
            MurMurVariable variable;
            try
            {
                variable = FindVariable(name);
            }
            catch (Exception ex)
            {
                throw new MurMurException(ex.Message, context.start.Line);
            }

            if (variable.HasValue())
                return variable;
            try
            {
                return Invoke(name);
            }
            catch (Exception ex)
            {
                throw new MurMurException(ex.Message, context.start.Line);
            }
        }

        public override MurMurVariable VisitReturn([NotNull] MurMurParser.ReturnContext context)
        {
            var value = Visit(context.expression());
            @return = value;
            return value;
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
                    return Invoke(name, parameters);
                }
                catch (Exception e)
                {
                    throw new MurMurException(string.Format("Method '{0}' failed with the message: {1}", name, e.Message), context.start.Line);
                }
            else
            {
                if (script.IgnoreUnknownMethods)
                    return new MurMurVariable();
                else
                    throw new MurMurException(string.Format("Couldn't find any variable or method called {0}", name), context.start.Line);
            }
        }

        public MurMurVariable FindVariable(string name)
        {
            object value;
            if (script.Locals.ContainsKey(name))
            {
                value = script.Locals[name];
            }
            else if (script.Globals.ContainsKey(name))
            {
                value = script.Globals[name];
            }
            else
            {
                throw new Exception("Cannot find variable (" + name + ")");
            }

            try
            {
                return MakeVariable(value);
            }
            catch (Exception ex)
            {
                if (script.UnsafeMode)
                    return new MurMurVariable("??" + name + "??");
                else
                    throw new Exception(ex.Message + " (" + name + ")");
            }

        }
        MurMurVariable MakeVariable(object value)
        {
            if (value is MurMurVariable)
                return (MurMurVariable)value;

            if (value is string)
                return new MurMurVariable(value as string);

            if (value is int)
                return new MurMurVariable((int)value);

            if (value is float)
                return new MurMurVariable((float)value);

            throw new Exception("Unknown variable type");
        }

        internal MurMurVariable Invoke(string function, params MurMurVariable[] parameters)
        {
            var method = script.Globals[function];
            if (method == null)
                    throw new Exception("Null method or variable (" + function + ")");

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

            if (method is Func<MurMurVariable[], MurMurVariable>)
            {
                var value = (method as Func<MurMurVariable[], MurMurVariable>).Invoke(parameters);
                @return = null;
                return value;
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

            if (method is Action)
            {
                (method as Action).Invoke();
                return new MurMurVariable();
            }

            if (script.UnsafeMode)
                return new MurMurVariable("??" + function + "??");
            else
                throw new Exception("Unknown method type (" + function + ")");
        }
        #region Operations And Values


        public override MurMurVariable VisitAssignExpression([NotNull] MurMurParser.AssignExpressionContext context)
        {
            var value = Visit(context.expression());
            script.Globals[context.WORD().GetText()] = value;
            return new MurMurVariable();
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

        public override MurMurVariable VisitPriorityExpression([NotNull] MurMurParser.PriorityExpressionContext context)
        {
            return Visit(context.expression());
        }

        public override MurMurVariable VisitMultiplicationExpression([NotNull] MurMurParser.MultiplicationExpressionContext context)
        {
            var values = context.expression();
            var a = Visit(values[0]);
            var b = Visit(values[1]);
            
            if (context.MUL_DIV_SIGNAL().GetText() == "*")
                return a * b;
            else
                return a / b;
        }

        public override MurMurVariable VisitAdditiveExpression([NotNull] MurMurParser.AdditiveExpressionContext context)
        {
            var values = context.expression();
            var a = Visit(values[0]);
            var b = Visit(values[1]);

            if (context.ADD_SUB_SIGNAL().GetText() == "+")
                return a + b;
            else
                return a - b;
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
                throw new MurMurException("Cannot parse " + text + " into a float", context.start.Line);
        }

        #endregion

        MurMurVariable? @return;
        protected override bool ShouldVisitNextChild([NotNull] IRuleNode node, MurMurVariable currentResult)
        {
            if (@return != null)
            {
                return false;
            }
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
