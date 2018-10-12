using MurMur;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MurMurExample
{
    class Program
    {
        static string example = @"
#another
	Hello to you!
        It works :)
	{goto:[intro]}
    
#intro
	Let's say...
    Let's try
	{goto:[target]}
	This is all wrong
	This is all super wroooong

#target
	Hello World!
	{goto:[another]}
";
        static void Main(string[] args)
        {
            var script = new MurMurScript();
            script.LoadString(example);

            script.GoToTag("intro");

            while (script.State != ScriptState.Done)
            {
                var line = script.Next();
                if (line != null)
                {
                    Console.WriteLine("TEXT LINE>>> {0}", line.Text);
                    Console.ReadKey();
                }
            }
            
        }
    }
}
