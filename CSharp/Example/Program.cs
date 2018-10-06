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
	Let's say...

	{goto:[target]}
	eita
	{if:@stress == [muita]}
		to stressada
	{end}

	
	{menu:[Vamos dizer algo]}
		opcao 1
		opcao 2
	{end}
	{goto:[target]}
	
#hidden
	This is wrong

#target
	Hello World!
	Hello to you!
	It works :)
";
        static void Main(string[] args)
        {
            var script = new MurMurScript();
            script.LoadString(example);
            script.GoToTag("target");


            Console.WriteLine();

            var name = Console.ReadKey();
        }
    }
}
