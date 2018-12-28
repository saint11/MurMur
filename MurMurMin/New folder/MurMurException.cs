using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace MurMur
{
    [Serializable]
    public class MurMurException : Exception
    {
        public MurMurException(string error, int line) 
            : base("MurMur: " + error + "(line: " + line + ")") { }
    }
}

