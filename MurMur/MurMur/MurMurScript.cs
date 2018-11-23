using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using MurMur.Grammar;
using System.Collections.Generic;
using System.Diagnostics;
using System.Collections;
using System;
using System.Linq;

namespace MurMur
{
    public enum ScriptState
    {
        NotInitialized,
        Talking,
        Done
    }

    public class MurMurScript
    {
        public Dictionary<string, object> Globals { get; private set; } = new Dictionary<string, object>();

        internal Dictionary<string,MurMurParser.BlockContext> Tags;

        string currentTag;

        internal MurMurLine currentLine;
        private MurMurVisitor visitor;

        public ScriptState State { get; internal set; }

        public MurMurScript()
        {
            Globals["goto"] = (Func<MurMurVariable, MurMurVariable>)Global_GoTo;
            Globals["set"] = (Func<MurMurVariable, MurMurVariable, MurMurVariable>)Global_Set;

#if UNITY_EDITOR
                Globals["print"] = (Func<MurMurVariable, MurMurVariable>)Global_Print;
#endif
        }

        public void LoadString(string input)
        {
            AntlrInputStream inputStream = new AntlrInputStream(input);
            MurMurLexer murMurLexer = new MurMurLexer(inputStream);
            CommonTokenStream tokenStream = new CommonTokenStream(murMurLexer);
            MurMurParser murMurParser = new MurMurParser(tokenStream);

            var tree = murMurParser.murmur();
            visitor = new MurMurVisitor(this);

            visitor.Visit(tree);
        }

        public MurMurLine Next(int choice = -1)
        {
            if (currentLine != null)
            {
                if (currentLine.Type != MurMurLineType.menu)
                    choice = -1;
                currentLine = null;
            }
            if (currentTag == null)
                GoToTag(Tags.FirstOrDefault().Key);

            if (State== ScriptState.Done)
            {
                return null;
            }
            else if (State == ScriptState.NotInitialized)
            {
                
                visitor.Visit(Tags[currentTag]);
                
                if (visitor.currentTree == null)
                    State = ScriptState.Done;
                else
                    State = ScriptState.Talking;
            }
            else
            {
                if (choice == -1) // This is a regular node
                    visitor.Resume();
                else // This should be a menu
                    visitor.ResumeMenu(choice);

                if (visitor.currentTree == null)
                    State = ScriptState.Done;
            }

            if (currentLine.Text != null && Globals.ContainsKey("say"))
            {
                visitor.Invoke("say", new MurMurVariable() { Text = currentLine.Text });
            }  
            return currentLine;
        }

        internal string NextText(int choice = -1)
        {
            string text = null;
            while (text==null && State!= ScriptState.Done)
            {
                text = Next(choice).Text;
            }

            return text;
        }


        /// <summary>
        /// Set the pointer to the start of the tag
        /// </summary>
        /// <param name="tagName"></param>
        public void GoToTag(string tagName)
        {
            State = ScriptState.NotInitialized;
            currentTag = tagName;
        }

        internal void SetVariables(Dictionary<string, string> variables)
        {
            foreach (var v in variables)
            {
                Globals[v.Key] = new MurMurVariable(v.Value);
            }
        }

        public void SetString(string name, string value)
        {
            Globals[name] = new MurMurVariable(value);
        }

        #region GLOBALS

        MurMurVariable Global_GoTo(MurMurVariable tag)
        {
            var target = tag.Text;
            return visitor.Visit(Tags[target]);
        }

        MurMurVariable Global_Set(MurMurVariable name, MurMurVariable value)
        {
            Globals[name.Text] = value;
            return value;
        }

#if UNITY_EDITOR
        MurMurVariable Global_Print(MurMurVariable text)
        {
            UnityEngine.Debug.Log(text.Text);
            return null;
        }
#endif

#endregion

    }
}
