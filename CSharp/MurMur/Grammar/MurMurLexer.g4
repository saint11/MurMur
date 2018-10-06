lexer grammar MurMurLexer;

// Formats
fragment LOWERCASE : [a-z] ;
fragment UPPERCASE : [A-Z] ;
fragment COMMENT_ESCAPE : '//';
fragment DIGIT : [0-9] ;


// Extras
WHITESPACE: (' ' | '\t')+ -> skip;
NEWLINE: ('\n' | '\r' | '\r\n')+;

// Comments
LINE_COMMENT: '//' ~[\r\n]* -> channel(HIDDEN) ;

// Symbols
TAG_START: ('#');
COMMAND_START: ('{') -> pushMode(INSIDE_COMMAND) ;
FAST_PICK_START: ('[') -> pushMode(FAST_PICK) ;
GOTO_START: ('>');

TEXT: (~([#{\r\n/[]) | '/'~'/')+;

mode INSIDE_COMMAND;
	COMMAND_IGNORE: (' ' | '\t' | '\n' | '\r' | '\r\n')+ -> skip;

	COMMAND_PARAMS_START:(':');
	COMMAND_STRING_START:('[') -> pushMode(STRING_MODE); //go is an exception and allows free text input

	COMMAND_PARAMS_SEPARATOR: (',');
	VARIABLE_START: '@';
	
	COMMAND_END: ('}') -> popMode;

	// Keywords
	KEYWORD_IF: ('if');
	KEYWORD_END: ('end');
	KEYWORD_GOTO: ('go');
	KEYWORD_MENU: ('menu');
	KEYWORD_PICK: ('pick');
	KEYWORD_PICK_THIS: ('this');

	// Expressions
	NUMBER: DIGIT+ ([.,] DIGIT+)?;
	INT: DIGIT+ ;
	WORD: (LOWERCASE | UPPERCASE | '_')+;

	// Comparisson
	COMPARISSON_SIGNAL: ('==' | '!=' | '>' | '<' | '>=' | '<=');
	OPERATION_SIGNAL: ('+'|'-'|'*'|'/');

mode FAST_PICK;
	SUB_TEXT_SEPARATOR: ('|');
	FAST_PICK_TEXT: (~([}\r\n/|\]]) | '/'~'/')+;
	FAST_PICK_END: (']')  -> popMode;

mode STRING_MODE;
	STRING: (~[\]])+;
	COMMAND_STRING_END: (']')-> popMode;
