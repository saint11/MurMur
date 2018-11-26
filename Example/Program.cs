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
Hello {player}, {if:welcome==true} welcome to the harvest outpost. {end}
I'm here to help with the harvesting.
{menu:[Are you ready to get started?]}
	{option:[I can do this on my own]}
		Ok, let me know if you need help.
	
	{option:[I'm not sure if I'm prepared]}
        {menu:[All right, do you know what are we harvesting here?]}
            {option: [No]}
                They didn't tell you anything?
            {option: [Minerals, I guess?]}
                Uh... No. We are harvesting Elder Blood.
            {option: [Elder blood]}
                Good, they told you that at least.
        {end}
		I'll explain how things work around here.
{end}
Talk to you later then.
";
        static void Main(string[] args)
        {
            var script = new MurMurScript();
            script.LoadString(example);
            script.SetString("player", "rodrigson");
            script.SetBool("welcome", true);

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
