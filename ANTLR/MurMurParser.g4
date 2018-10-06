parser grammar MurMurParser;

options { tokenVocab = MurMurLexer; }

murmur: tag+ EOF ;
tag: TAG_START TEXT NEWLINE* (block)+;

block
	: (text+
	| pickCommand NEWLINE* pickBlock+ endCommand
	| menuCommand NEWLINE* block+ endCommand
	| ifCommand NEWLINE* block+ endCommand
	| command
	) + NEWLINE*;

text
	: TEXT
	| ifCommand text endCommand
	| fastPickBlock;

fastPickBlock: FAST_PICK_START FAST_PICK_TEXT (SUB_TEXT_SEPARATOR FAST_PICK_TEXT)* FAST_PICK_END;
pickBlock: pickThisCommand NEWLINE* block*;

command: COMMAND_START commandId (COMMAND_PARAMS_START params)? COMMAND_END;
params: expression (COMMAND_PARAMS_SEPARATOR expression)*;
expression
	: INT
	| NUMBER
	| COMMAND_STRING_START STRING COMMAND_STRING_END
	| variable
	| expression OPERATION_SIGNAL expression
	| expression COMPARISSON_SIGNAL expression
	;

variable: VARIABLE_START WORD ;
commandId: WORD ;

pickCommand: COMMAND_START KEYWORD_PICK COMMAND_END;
pickThisCommand: COMMAND_START KEYWORD_PICK_THIS COMMAND_PARAMS_START NUMBER COMMAND_END;
menuCommand: COMMAND_START KEYWORD_MENU  (COMMAND_PARAMS_START expression)? COMMAND_END;
ifCommand: COMMAND_START KEYWORD_IF COMMAND_PARAMS_START expression COMMAND_END;
endCommand: COMMAND_START KEYWORD_END COMMAND_END;