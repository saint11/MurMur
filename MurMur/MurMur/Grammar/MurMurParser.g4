parser grammar MurMurParser;

options { tokenVocab = MurMurLexer; }

murmur: NEWLINE* tag+;
tag: TAG_START TEXT NEWLINE* block;

block
	: (ifBlock
	| pickBlock
	| menuBlock
	| line
	)+ ;

// Block types
pickBlock: pickCommand NEWLINE* pickThisBlock+ endCommand (NEWLINE+ | EOF);
menuBlock: menuCommand NEWLINE* menuSubBlock+ endCommand (NEWLINE+ | EOF);
ifBlock: ifCommand NEWLINE+ block (elseCommand NEWLINE+ block)? endCommand (NEWLINE+ | EOF);

line
	: lineFragment+ (NEWLINE+ | EOF)
	;

lineFragment
	: TEXT
	| inlineIfBlock
	| command
	| fastPickBlock
	;

inlineIfBlock: ifCommand inlineIfTrueFragment (elseCommand inlineIfFalseFragment)? endCommand;
inlineIfTrueFragment: lineFragment+;
inlineIfFalseFragment: lineFragment+;

menuSubBlock
	: menuOptionCommand NEWLINE* block?
	;

fastPickBlock: FAST_PICK_START FAST_PICK_TEXT (SUB_TEXT_SEPARATOR FAST_PICK_TEXT)* FAST_PICK_END;
pickThisBlock: pickThisCommand NEWLINE* block*;

command
	: COMMAND_START expression COMMAND_END
	;


string
	: COMMAND_STRING_START STRING COMMAND_STRING_END
	;

expression

	: NUMBER											# numberExpression
	| (TRUE | FALSE)									# booleanExpression
	| WORD												# methodOrVariableExpression
	| WORD (COMMAND_PARAMS_START params)?				# methodExpression
	| string											# stringExpression
	
	| OPEN_PAREN expression CLOSE_PAREN					# priorityExpression
	| expression MUL_DIV_SIGNAL expression				# multiplicationExpression
	| expression ADD_SUB_SIGNAL expression				# additiveExpression
	
	| expression COMPARISSON_SIGNAL expression			# comparissonExpression
	| WORD ASSIGN_SIGNAL expression						# assignExpression
	;

params: expression (COMMAND_PARAMS_SEPARATOR expression)*;


pickCommand: COMMAND_START KEYWORD_PICK COMMAND_END;
pickThisCommand: COMMAND_START KEYWORD_PICK_THIS COMMAND_PARAMS_START NUMBER COMMAND_END;
menuCommand: COMMAND_START KEYWORD_MENU  (COMMAND_PARAMS_START expression)? COMMAND_END;
menuOptionCommand: COMMAND_START KEYWORD_MENU_OPTION COMMAND_PARAMS_START expression (COMMAND_PARAMS_SEPARATOR expression) COMMAND_END;
ifCommand: COMMAND_START KEYWORD_IF COMMAND_PARAMS_START expression COMMAND_END;
elseCommand: COMMAND_START KEYWORD_ELSE COMMAND_END;
endCommand: COMMAND_START KEYWORD_END COMMAND_END;