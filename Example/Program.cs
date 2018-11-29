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
#start
Hello {player}, welcome to the royal harvest outpost.
{skip:[orders]}

#orders
{menu:[What are my orders?]}
	{option:[Ask for more info]}
		We're currently in currentLocation.
		{skip:[orders]}
	{option:[Mine for metals]}
    	Ok, I can do that.
	{option:[Mine for elder blood]}
    	Yeah... I just hope it's safe.
{end}
This should appear only once!
";
        static void Main(string[] args)
        {
            var script = new MurMurScript();
            script.LoadString(example);
            script.GoToTag("start");

            script.SetString("player", "player_name");
            script.SetBool("welcome", false);

            int choice = 0;

            while (script.State != ScriptState.Done)
            {
                var line = script.Next(choice);

                if (line.Type == MurMurLineType.text)
                {
                    Console.WriteLine("TEXT LINE>>> {0}", line.Text);
                    Console.ReadKey();
                }
                else if (line.Type == MurMurLineType.menu)
                {
                    Console.WriteLine("MENU START>>> {0}", line.Text != null ? line.Text : "");

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
