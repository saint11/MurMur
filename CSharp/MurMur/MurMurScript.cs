using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using MurMur.Grammar;
using System;
using System.Collections.Generic;
using System.Diagnostics;

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

        public MurMurLine Next()
        {
            if (State== ScriptState.Done)
            {
                return null;
            }
            else if (State == ScriptState.NotInitialized)
            {
                visitor.Visit(Tags[currentTag]);
                State = ScriptState.Talking;
            }
            else
            {
                visitor.Resume();
                if (visitor.currentTree == null)
                    State = ScriptState.Done;
            }

            return State == ScriptState.Done? null : currentLine;
        }


        /// <summary>
        /// Set the pointer to the start of the tag
        /// </summary>
        /// <param name="tagName"></param>
        public void GoToTag(string tagName)
        {
            currentTag = tagName;
        }

        
    }
}
