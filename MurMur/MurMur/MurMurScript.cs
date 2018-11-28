﻿using Antlr4.Runtime;
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
        bool clearStack;

        internal MurMurLine currentLine;
        private MurMurVisitor visitor;

        public ScriptState State { get; internal set; }

        public MurMurScript()
        {
            Globals["goto"] = (Action<MurMurVariable>)Global_GoTo;
            Globals["skip"] = (Action<MurMurVariable>)Global_Skip;
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
            if (currentLine != null && currentLine.Type != MurMurLineType.menu)
                choice = -1;

            currentLine = null;

            while (currentLine == null)
            {
                if (currentTag == null)
                    GoToTag(Tags.FirstOrDefault().Key);

                if (State == ScriptState.Done)
                {
                    return new MurMurLine() { Type = MurMurLineType.eof };
                }
                else if (State == ScriptState.NotInitialized)
                {
                    visitor.Visit(Tags[currentTag]);
                    State = ScriptState.Talking;
                }
                else
                {
                    if (choice == -1) // This is a regular node
                    {
                        visitor.Resume();
                    }
                    else // This should be a menu
                        visitor.ResumeMenu(choice);
                }

                if (State == ScriptState.NotInitialized)
                {
                    if (clearStack)
                    {
                        visitor.currentStack.Clear();
                        clearStack = false;
                    }
                    return Next(choice);
                }

                CheckForState();
            }

            return currentLine;
        }

        private void CheckForState()
        {
            if (visitor.currentStack.Count == 0)
                State = ScriptState.Done;
        }

        internal string NextText(int choice = -1)
        {
            return  Next(choice).Text;
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

        public void SetBool(string name, bool value)
        {
            Globals[name] = new MurMurVariable(value);
        }

        public void SetString(string name, string value)
        {
            Globals[name] = new MurMurVariable(value);
        }

#region GLOBALS

        void Global_GoTo(MurMurVariable tag)
        {
            GoToTag(tag.Text);
        }

        void Global_Skip(MurMurVariable tag)
        {
            clearStack = true;
            GoToTag(tag.Text);
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
            return new MurMurVariable();
        }
#endif

#endregion

    }
}
