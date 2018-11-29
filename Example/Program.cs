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
	{fistTimeTalking=false}
	{skip:[start]}

#start
	Greetings {player}.
	{if:fistTimeTalking}
		Welcome to the Royal Castle of Ghoulcrest.
		{menu:[Are you familiar with your job in here?]}
			{option:[Yes, I know what I am doing]}
				Good. Let me know if you change your mind.
			{option:[No, explain it to me]}
				{skip:[intro]}
		{end}
	{else}
		I hope you find everything in order.
		{menu:[Can I help you with anything?]}
			{option:[I need help understanding this job]}
				{skip:[intro]}
			{option:[No, thanks]}
				Just let me know if you need anything.
		{end}
	{end}

#intro
	We are here to mine Elder Blood
";
        static void Main(string[] args)
        {
            var script = new MurMurScript();
            script.UnsafeMode = true;
            script.LoadString(example);
            script.GoToTag("init");

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
