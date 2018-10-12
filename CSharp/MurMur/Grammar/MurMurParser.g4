parser grammar MurMurParser;

options { tokenVocab = MurMurLexer; }

murmur: NEWLINE* tag+ EOF ;
tag: TAG_START TEXT NEWLINE* block;

block
	: (textLine
	| pickBlock
	| menuBlock
	| ifBlock
	| command
	| NEWLINE+
	)+ ;

// Block types
pickBlock: pickCommand NEWLINE* pickThisBlock+ endCommand;
menuBlock: menuCommand NEWLINE* block+ endCommand;
ifBlock: ifCommand NEWLINE* block+ endCommand;

textLine
	: text+;
text
	: TEXT
	| ifCommand textLine endCommand
	| fastPickBlock
	;

fastPickBlock: FAST_PICK_START FAST_PICK_TEXT (SUB_TEXT_SEPARATOR FAST_PICK_TEXT)* FAST_PICK_END;
pickThisBlock: pickThisCommand NEWLINE* block*;

command: COMMAND_START WORD (COMMAND_PARAMS_START params)? COMMAND_END;
params: expression (COMMAND_PARAMS_SEPARATOR expression)*;
expression
	: (NUMBER | INT)									# numberExpression
	| COMMAND_STRING_START STRING COMMAND_STRING_END	# stringExpression
	| variable											# variableExpression
	| expression MUL_DIV_SIGNAL expression				# multiplicationExpression
	| expression ADD_SUB_SIGNAL expression				# additionExpression
	| expression COMPARISSON_SIGNAL expression			# comparissonExpression
	;

variable: VARIABLE_START WORD ;

pickCommand: COMMAND_START KEYWORD_PICK COMMAND_END;
pickThisCommand: COMMAND_START KEYWORD_PICK_THIS COMMAND_PARAMS_START NUMBER COMMAND_END;
menuCommand: COMMAND_START KEYWORD_MENU  (COMMAND_PARAMS_START expression)? COMMAND_END;
ifCommand: COMMAND_START KEYWORD_IF COMMAND_PARAMS_START expression COMMAND_END;
endCommand: COMMAND_START KEYWORD_END COMMAND_END;