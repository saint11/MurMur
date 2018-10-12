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
#intro
	Hello to you!
    It works ?
    It works :)
#introdois
	Hello to you!
    It works :)
";
        static void Main(string[] args)
        {
            var script = new MurMurScript();
            script.LoadString(example);

            script.GoToTag("intro");

            while (script.State != ScriptState.Done)
            {
                var line = script.Next();
                    Console.WriteLine("TEXT LINE>>> {0}", line.Text);
                    Console.ReadKey();
            }
            
        }
    }
}
