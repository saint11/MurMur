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
  {goto:[tag]}

#tag
  Line of dialog
  Another line, with a {variable} or {shake:2} method
  {menu:[Strings are under square brackets]}
    {option:[This is a menu option]}
      This option will render this line.
    {option:[This is another menu option]}
      The other option will render this other line and jump to another tag
      {skip:[another]}
  {end}
      
#another
  This is another tag!
  You can also set values and make operations
  {foo = [abra]}
  {boo = [cadabra]}
  Let's say {foo + boo}
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
