using System;
using System.Collections.Generic;
using System.Text;
using MurMur.Grammar;

namespace MurMur
{
    class MurMurTag
    {
        public string Name { get; internal set; }
        
        public MurMurParser.BlockContext[] Blocks { get; internal set; }
    }
}
