﻿using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using MurMur.Grammar;
using System.Collections.Generic;
using System.Diagnostics;
using System.Collections;
using System;
using System.Linq;
using System.IO;

#if UNITY_EDITOR
    using UnityEngine;
#endif

namespace MurMur
{
    public enum ScriptState
    {
        Empty,
        NotInitialized,
        Talking,
        Done
    }

    public class MurMurScript
    {
        public Dictionary<string, object> Globals { get; private set; } = new Dictionary<string, object>();

        internal Dictionary<string,MurMurParser.BlockContext> Tags;

        string CurrentTag;
        bool ClearStack;

        internal MurMurLine CurrentLine;
        private MurMurVisitor Visitor;

        public ScriptState State { get; internal set; }


        public string Path;

        // Debug and testing
        public bool UnsafeMode = false;
        public bool IgnoreUnknownMethods = false;

        public MurMurScript()
        {
            Clear();
        }


        #region Loading

        public void Clear()
        {
            State = ScriptState.Empty;
            Path = System.IO.Path.GetDirectoryName(System.Reflection.Assembly.GetExecutingAssembly().Location);

            ClearStack = false;
            CurrentTag = null;
            Tags = new Dictionary<string, MurMurParser.BlockContext>();
            Globals = new Dictionary<string, object>();

            Globals["goto"] = (Action<MurMurVariable>) Global_GoTo;
            Globals["skip"] = (Action<MurMurVariable>) Global_Skip;
            Globals["set"] = (Func<MurMurVariable, MurMurVariable, MurMurVariable>)Global_Set;

#if UNITY_EDITOR
            Globals["print"] = (Func<MurMurVariable, MurMurVariable>)Global_Print;
#else
            Globals["print"] = (Action<MurMurVariable>)Global_Print;
#endif
        }

        public void LoadFile(string path)
        {
            if (State != ScriptState.Empty)
                throw new Exception("Cannot load over a loaded script, use 'Clear' before.");

            State = ScriptState.NotInitialized;
            Visitor = new MurMurVisitor(this);
            Path = path;

            AppendFile(path);
        }

        public void LoadString(string input)
        {
            if (State != ScriptState.Empty)
                throw new Exception("Cannot load over a loaded script, use 'Clear' before.");

            State = ScriptState.NotInitialized;
            Visitor = new MurMurVisitor(this);

            AppendString(input);
        }

        private bool TryLoading(string path, out string text)
        {

#if UNITY_EDITOR
            var file = (TextAsset)Resources.Load(path, typeof(TextAsset));
            //var file = Resources.Load<TextAsset>(path);

            if (file != null)
            {
                text = file.text;
                AppendString(text);
                return true;
            }
            else
            {
                text = null;
                return false;
            }
#else
            if (File.Exists(path))
            {
                text = File.ReadAllText(path);
                AppendString(text);
                return true;
            }
#endif

            text = null;
            return false;
        }


        /// <summary>
        /// Using when including new files in a existing MurMurScript.
        /// </summary>
        /// <param name="file"></param>
        public bool AppendFile(string path)
        {
            string text;

            if (TryLoading(path, out text))
                return true;
            else if (TryLoading(path + ".mur", out text))
                return true;
            else if (TryLoading(path + ".murmur", out text))
                return true;

            throw new Exception(string.Format("Cannot find file '{0}' to load. Are you sure it's there?", path));
        }

        private void AppendString(string input)
        {
            AntlrInputStream inputStream = new AntlrInputStream(input);
            MurMurLexer murMurLexer = new MurMurLexer(inputStream);
            CommonTokenStream tokenStream = new CommonTokenStream(murMurLexer);
            MurMurParser murMurParser = new MurMurParser(tokenStream);

            var tree = murMurParser.murmur();

            Visitor.Visit(tree);
        }

        #endregion

        public MurMurLine Next(int choice = -1)
        {
            var previousLine = CurrentLine;
            CurrentLine = null;

            while (CurrentLine == null || CurrentLine.Type == MurMurLineType.empty || string.IsNullOrEmpty(CurrentLine.Text))
            {
                if (CurrentLine != null)
                {
                    previousLine = CurrentLine;
                    CurrentLine = null;
                }

                if (CurrentTag == null)
                    GoToTag(Tags.FirstOrDefault().Key);

                if (State == ScriptState.Done)
                {
                    return new MurMurLine() { Type = MurMurLineType.eof };
                }
                else if (State == ScriptState.NotInitialized)
                {
                    State = ScriptState.Talking;
                    if (Tags.ContainsKey(CurrentTag))
                        Visitor.Visit(Tags[CurrentTag]);
                    else
                        throw new Exception("Cannot find tag " + CurrentTag + "(remember that tags are case-sensitive)");
                }
                else
                {
                    if (previousLine?.Type == MurMurLineType.menu)
                    {
                        Visitor.ResumeMenu(choice);
                    }
                    else
                    {
                        CurrentLine = null;
                        Visitor.Resume();
                    }
                }

                if (State == ScriptState.NotInitialized)
                {
                    if (ClearStack)
                    {
                        Visitor.currentStack.Clear();
                        ClearStack = false;
                    }
                    return Next(choice);
                }

                CheckForState();
            }

            return CurrentLine;
         }

        private void CheckForState()
        {
            if (Visitor.currentStack.Count == 0)
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
            CurrentTag = tagName;
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
            ClearStack = true;
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
#else
        void Global_Print(MurMurVariable text)
        {
            Debug.WriteLine(text.Text);
        }
#endif

        #endregion

    }
}
