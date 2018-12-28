![MurMur Logo](https://raw.githubusercontent.com/saint11/MurMur/master/MurMurLogo_256.png)
# MurMur
A lightweight language for writing dialog and cutscenes! This is intended to be easy to use but still able to create complex sequences and characters. This repo contains an interpreter that can help you to read texts written in the MurMur syntax for your C# game.

The interpreter, documentation and the language itself is still in a very early stage, so I would **not** recommend using it just yet.

## Getting Started
For now just grab the MurMurMin folder and copy it to your project. In the future a pre-copiled DLL or a NUGET package might be the best option, but since the project is still **very** unstable it's recomended that you have the original files handy. Another option is to add the whole MurMurProject into yours, but that might be inconvenient, specially with unity.

Now you can just create a MurMurScript object, load a string containing the script and just ask for `script.Next()` for the next line. Yep, that simple.
```C#
string example = @"
@include:[another file.mur]

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

### Commands
Anything inside curly braces (`{` and `}`) will be considered a command, there are many types of commands, here's the most common ones:

#### String
`{[Hello world!]}`

In most languages `"` is used to separate a string text from the code, but since that character is often used in dialog we should use `[` and `]` to create text strings in MurMur.

#### Number
`{35.7}`

Numbers in MurMur use `.` to separate the decimal point. There's no distinction between integers, floats, doubles, etc. Everything is a float.

### Simple Operation
`{[just a string ] + [another string]}`
`{[just a string ] + 123}`
`{2 / 2}`

You can append strings, numbers just like you can do in most languages. If you try to add a number to a string it will be automatically converted to a string.

#### Simple command
`{command_or_variable_name}`

This will check if `command_or_variable_name` is a method, then it will run the method and check if there's a returned value, if so it will append it to the current line text. If it's a variable it will just append the variable value to the current line text.
If the name doesn't match anything it place `??command_name??` in the line text.

#### Command with parameters
`{command_name:[string parameter], 123, true, [more parameters]}`

The same thing as the simple command, but will call a method with the parameters in front of the `:`. You can have as many parameters as you want.

#### Assing variable
`{variable_to_assign = 2}`

Create or change the value of a variable to a expression. You can perform simple operations such as `{foo = 3 + 3}` or `{magic = [abra] + another_variable}`.


### Headers
The header is a place for special commands and they should be declared before the tags start. They start with the `@`character

#### Including more files
It's not very practical to work with very long files, so you can break them down into multiple files. To do so, simply write this before starting with the tags of a file:

`@include: [file to include]`

It will search for the exact match, a `.mur` and `.murmur` file in the application folder. You can change the script path via C# too.
Remember that you can include multiple files, and watch out, because you can accidentally include a file more than once.

***
Still working on the documentation, sorry, for now check the example project included in this repository

## License
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
