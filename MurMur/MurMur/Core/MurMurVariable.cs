using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.Text;

namespace MurMur
{
    [Serializable]
    public struct MurMurVariable
    {
        public string Text;
        public float Number;
        public bool Boolean
        {
            get
            {
                return
                    Text?.ToLower() == "true" ||
                    Number == 1;
            }
            set { Number = value? 1 : -1; }
        }

        internal ParserRuleContext Halt;

        public MurMurVariable(string value)
        {
            Text = value;
            Number = 0;
            Halt = null;
        }

        public MurMurVariable(int value)
        {
            Text = null;
            Number = value;
            Halt = null;
        }

        public MurMurVariable(float value)
        {
            Text = null;
            Number = value;
            Halt = null;
        }

        public MurMurVariable(bool boolean)
        {
            Text = null;
            Number = boolean? 1 : -1;
            Halt = null;
        }

        public static bool operator ==(MurMurVariable a, MurMurVariable b)
        {
            return a.Text == b.Text && a.Number==b.Number && a.Halt==b.Halt;
        }
        public static bool operator !=(MurMurVariable a, MurMurVariable b)
        {
            return a.Text != b.Text || a.Number!=b.Number || a.Halt!=b.Halt;
        }
    }
}
