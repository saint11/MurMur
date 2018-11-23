using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.Text;

namespace MurMur
{
    [Serializable]
    public class MurMurVariable
    {
        public string Text;
        public float Number;

        internal ParserRuleContext Halt = null;

        public MurMurVariable()
        { }

        public MurMurVariable(string value)
        {
            Text = value;
        }

        public MurMurVariable(int value)
        {
            Number = value;
        }

        public MurMurVariable(float value)
        {
            Number = value;
        }
    }
}
