using System;
using System.Collections.Generic;
using System.Text;
using MurMur.Grammar;

namespace MurMur
{
    public enum MurMurLineType
    {
        text,
        command
    }

    public class MurMurLine
    {
        
        public string Text;

        public string Command;
        public MurMurVariable[] Params;
        internal MurMurParser.TextLineContext Context;
    }
}
