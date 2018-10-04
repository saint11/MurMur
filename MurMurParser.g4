parser grammar MurMurParser;

options { tokenVocab = MurMurLexer; }

murmur: tag+ EOF ;
tag: TAG_START TEXT NEWLINE* (line)+;

line: (TEXT | command) + NEWLINE*;
statement: (TEXT | command) ;
command: COMMAND_START commandId (COMMAND_START_PARAMS expression)? COMMAND_END;
expression: INT | WORD | variable ;
variable: VARIABLE_START TEXT ;
commandId: WORD ;
