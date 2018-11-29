![MurMur Logo](https://raw.githubusercontent.com/saint11/MurMur/master/MurMurLogo_256.png)
# MurMur
A lightweight language for writing dialog and cutscenes! This is intended to be easy to use but still able to create complex sequences and characters. This repo contains an interpreter that can help you to read texts written in the MurMur syntax for your C# game.

The interpreter, documentation and the language itself is still in a very early stage, so I would **not** recommend using it just yet.

## Getting Started
For now just grab the MurMurMin folder and copy it to your project. In the future a pre-copiled DLL or a NUGET package might be the best option, but since the project is still **very** unstable it's recomended that you have the original files handy. Another option is to add the whole MurMurProject into yours, but that might be inconvenient, specially with unity.

Now you can just create a MurMurScript object, load a string containing the script and just ask for `script.Next()` for the next line. Yep, that simple.
```C#
string example = @"
#start
Hello world!
";

var script = new MurMurScript();
script.LoadString(example);
var line = script.Next();
Console.WriteLine(line.Text);
```
The MurMurLine object that the `script.Next()` method returns has the type of the current line (text, menu, EOF), the actual text and options.

## Basic Syntax
```
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
```

### Tags
The MurMur file is split into Tags and each tag represents a block of dialog. When the MurMur Script finishes a tag it stops and triggers the "Done" state. You can jump to another tag using the `{goto:[destination]}` or `{skip:[destination]}` commands.
`{goto:[destination]}` Will go to the target tag and bounce back to the current line after that tag is done, `{skip:[destination]}` will clear the stack, just jumping to the tag and ignoring anything ahead.

### Lines
Basically, everything is a line. Lines can contain text or commands. Line breaks will stop the execution, return their value and wait for the next `script.Next()` to be called. Commands will keep running until the end of file is reached or until a line with text appears.

[Still working on the documentation, sorry, for now check the example project included in this repository]

## Licence
MIT License

Copyright (c) 2018 Pedro Medeiros de Almeida

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the Software), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, andor sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED AS IS, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
