using Antlr4.Runtime;
using System;

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
                    Number == 1 ||
                    Text?.ToLower() == "true";
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

        public static MurMurVariable operator +(MurMurVariable a, MurMurVariable b)
        {
            if (a.Type == MurMurVariable.MurMurType.Text && b.Type == MurMurVariable.MurMurType.Text)
            {
                return new MurMurVariable(a.Text + b.Text);
            }
            else if (a.Type == MurMurVariable.MurMurType.Number && b.Type == MurMurVariable.MurMurType.Text)
            {
                return new MurMurVariable(a.Number.ToString() + b.Text);
            }
            else if (a.Type == MurMurVariable.MurMurType.Text && b.Type == MurMurVariable.MurMurType.Number)
            {
                return new MurMurVariable(a.Text + b.Number.ToString());
            }
            else if (a.Type == MurMurVariable.MurMurType.Number && b.Type == MurMurVariable.MurMurType.Number)
            {
                return new MurMurVariable(a.Number + b.Number);
            }

            throw new Exception(string.Format("Cannot add {0} and {1}", a.ToString(), b.ToString()));
        }

        public static MurMurVariable operator -(MurMurVariable a, MurMurVariable b)
        {
            if (a.Type == MurMurVariable.MurMurType.Text && b.Type == MurMurVariable.MurMurType.Text)
            {
                return new MurMurVariable(a.Text.Replace(b.Text, ""));
            }
            else if (a.Type == MurMurVariable.MurMurType.Number && b.Type == MurMurVariable.MurMurType.Text)
            {
                return new MurMurVariable(a.Number.ToString().Replace(b.Text, ""));
            }
            else if (a.Type == MurMurVariable.MurMurType.Text && b.Type == MurMurVariable.MurMurType.Number)
            {
                return new MurMurVariable(a.Text.Replace(b.Number.ToString(), ""));
            }
            else if (a.Type == MurMurVariable.MurMurType.Number && b.Type == MurMurVariable.MurMurType.Number)
            {
                return new MurMurVariable(a.Number - b.Number);
            }

            throw new Exception(string.Format("Cannot subtract {0} and {1}", a.ToString(), b.ToString()));
        }

        public static MurMurVariable operator *(MurMurVariable a, MurMurVariable b)
        {
            if (a.Type == MurMurVariable.MurMurType.Number && b.Type == MurMurVariable.MurMurType.Number)
            {
                return new MurMurVariable(a.Number * b.Number);
            }

            throw new Exception(string.Format("Cannot multiply {0} by {1}", a.ToString(), b.ToString()));
        }

        public static MurMurVariable operator /(MurMurVariable a, MurMurVariable b)
        {
            if (a.Type == MurMurVariable.MurMurType.Number && b.Type == MurMurVariable.MurMurType.Number)
            {
                return new MurMurVariable(a.Number / b.Number);
            }

            throw new Exception(string.Format("Cannot divide {0} by {1}", a.ToString(), b.ToString()));
        }

        public static bool operator >(MurMurVariable a, MurMurVariable b)
        {
            if (a.Type==MurMurType.Number && b.Type == MurMurType.Number)
            {
                return a.Number > b.Number;
            }
            throw new Exception(string.Format("Cannot compare {0} > {1}", a.ToString(), b.ToString()));
        }

        public static bool operator <(MurMurVariable a, MurMurVariable b)
        {
            if (a.Type == MurMurType.Number && b.Type == MurMurType.Number)
            {
                return a.Number < b.Number;
            }
            throw new Exception(string.Format("Cannot compare {0} > {1}", a.ToString(), b.ToString()));
        }

        public static bool operator >=(MurMurVariable a, MurMurVariable b)
        {
            if (a.Type == MurMurType.Number && b.Type == MurMurType.Number)
            {
                return a.Number >= b.Number;
            }
            throw new Exception(string.Format("Cannot compare {0} > {1}", a.ToString(), b.ToString()));
        }

        public static bool operator <=(MurMurVariable a, MurMurVariable b)
        {
            if (a.Type == MurMurType.Number && b.Type == MurMurType.Number)
            {
                return a.Number <= b.Number;
            }
            throw new Exception(string.Format("Cannot compare {0} > {1}", a.ToString(), b.ToString()));
        }

        public static bool operator ==(MurMurVariable a, MurMurVariable b)
        {
            if (a.Type == MurMurType.Boolean)
            {
                if (b.Type == MurMurType.Boolean)
                    return a.Boolean == b.Boolean;
                else if (b.Type == MurMurType.Number)
                    return a.Boolean == (b.Number > 0);
                else if (b.Type == MurMurType.Text)
                    return a.Boolean == (b.Text.ToLower() == "true");
            }
            else if (a.Type == MurMurType.Number)
            {
                if (b.Type == MurMurType.Boolean)
                    return (a.Number > 0) == b.Boolean;
                else if (b.Type == MurMurType.Number)
                    return a.Number == b.Number;
                else if (b.Type == MurMurType.Text)
                    return a.Number.ToString() == b.Text;
            }
            else if (a.Type == MurMurType.Text)
            {
                if (b.Type == MurMurType.Boolean)
                    return (a.Text.ToLower() == "true") == b.Boolean;
                else if (b.Type == MurMurType.Number)
                    return a.Text == b.Number.ToString();
                else if (b.Type == MurMurType.Text)
                    return a.Text == b.Text;
            }

            throw new Exception(string.Format("Cannot compare {0} == {1}", a.ToString(), b.ToString()));
            //return a.Text == b.Text && a.Number==b.Number && a.Halt==b.Halt;
        }
        public static bool operator !=(MurMurVariable a, MurMurVariable b)
        {
            return !(a==b);
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
