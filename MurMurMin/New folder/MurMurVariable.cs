using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.Text;

namespace MurMur
{
    [Serializable]
    public struct MurMurVariable
    {
        public MurMurType Type;
        public string Text;
        public float Number;

        public enum MurMurType
        {
            Uninitialized, Text, Number, Boolean
        }

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
            Type = MurMurType.Text;
            Text = value;
            Number = 0;
            Halt = null;
        }

        public MurMurVariable(int value)
        {
            Type = MurMurType.Number;

            Text = null;
            Number = value;
            Halt = null;
        }

        public MurMurVariable(float value)
        {
            Type = MurMurType.Number;

            Text = null;
            Number = value;
            Halt = null;
        }

        public MurMurVariable(bool boolean)
        {
            Type = MurMurType.Boolean;

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

        internal bool HasValue()
        {
            return Type != MurMurType.Uninitialized;
        }

        public override string ToString()
        {
            if (Type == MurMurType.Text)
            {
                return Text;
            }
            else if (Type == MurMurType.Number)
            {
                return Number.ToString();
            }
            else if (Type == MurMurType.Boolean)
            {
                return Boolean.ToString();
            }

            return "UNDEFINED VALUE";
        }
    }
}
