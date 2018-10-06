using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using MurMur.Grammar;
using System;
using System.Collections.Generic;
using System.Text;

namespace MurMur
{
    internal class MurMurVisitor: MurMurParserBaseVisitor<object>
    {
        public List<MurMurTag> Tags = new List<MurMurTag>();

        public override object VisitTag([NotNull] MurMurParser.TagContext context)
        {
            MurMurTag tag = new MurMurTag()
            {
                Name = context.TEXT().GetText(),
                Blocks = context.block()
            };

            Tags.Add(tag);
            return tag;
        }

        public override object VisitBlock([NotNull] MurMurParser.BlockContext context)
        {
            MurMurBlock block = new MurMurBlock()
            {
                Literal = context.GetText()
            };
            return block;
        }
    }
}
