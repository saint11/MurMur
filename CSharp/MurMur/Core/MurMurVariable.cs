using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.Text;

namespace MurMur
{
    public class MurMurVariable
    {
        public string Text;
        public float Number;

        internal ParserRuleContext Halt = null;
    }
}
