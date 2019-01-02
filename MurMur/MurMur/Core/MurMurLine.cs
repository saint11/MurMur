namespace MurMur
{
    public enum MurMurLineType
    {
        text,
        command,
        menu,
        eof,
        empty
    }

    public class MurMurLine
    {
        public MurMurLineType Type;

        public string Text;

        public string Command;
        public MurMurVariable[] Params;

        public string[] OptionsText;
    }
}
