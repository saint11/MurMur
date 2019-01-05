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
#init
	Hello World!
    {print:[wow]}
    This is in another line.
    {menu:[This is a question]}
    	{option:[answer 1]}
            {print:[wow]}
    		This is the first outcome.
		{option:[answer 2]}
			This is the second outcome.
    {end}
    But you are always back right here!
";
        static void Main(string[] args)
        {
            var script = new MurMurScript();
            script.UnsafeMode = true;

            script.LoadString(example);
            //script.LoadFile("hello");

            script.GoToTag("init");

            int choice = 0;

            while (script.State != ScriptState.Done)
            {
                var line = script.Next(choice);

                if (line.Type == MurMurLineType.text)
                {
                    Console.WriteLine(">> {0}", line.Text);
                    Console.ReadKey();
                }
                else if (line.Type == MurMurLineType.menu)
                {
                    Console.WriteLine(">> {0}", line.Text != null ? line.Text : "");

                    for (int i = 0; i < line.OptionsText.Length; i++)
                    {
                        Console.WriteLine("<{1}> {0}", line.OptionsText[i], i);
                    }

                    int value = -1;
                    while (value < 0)
                    {
                        int.TryParse(Console.ReadKey().KeyChar.ToString(), out value);
                        Console.WriteLine();
                    }
                    choice = value;
                }
            }
        }
    }
}
