using Antlr4.Runtime;
using MurMur.Grammar;
using System;
using System.Collections.Generic;

namespace MurMur
{
    public class MurMurScript
    {
        MurMurTag[] tags;
        MurMurTag currentTag;


        public void LoadString(string input)
        {
            Console.WriteLine("Murmur starting...");
            AntlrInputStream inputStream = new AntlrInputStream(input);
            MurMurLexer murMurLexer = new MurMurLexer(inputStream);
            CommonTokenStream tokenStream = new CommonTokenStream(murMurLexer);
            MurMurParser murMurParser = new MurMurParser(tokenStream);

            var tree = murMurParser.murmur();

            var visitor = new MurMurVisitor();

            visitor.Visit(tree);

            tags = new MurMurTag[visitor.Tags.Count];
            visitor.Tags.CopyTo(tags);
        }


        /// <summary>
        /// Set the pointer to the start of the tag
        /// </summary>
        /// <param name="tagName"></param>
        public void GoToTag(string tagName)
        {
            foreach (var tag in tags)
            {
                if (tag.Name == tagName)
                {
                    currentTag = tag;
                    break;
                }
            }

            foreach (var b in currentTag.Blocks)
            {
                Console.WriteLine(b.GetText());
            }
        }

        
    }
}
