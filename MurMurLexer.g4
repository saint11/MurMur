lexer grammar MurMurLexer;

// Formats
fragment LOWERCASE : [a-z] ;
fragment UPPERCASE : [A-Z] ;
fragment COMMENT_ESCAPE : '//';
fragment DIGIT : [0-9] ;


// Extras
WHITESPACE: (' ' | '\t') -> skip;
NEWLINE: ('\n' | '\r' | '\r\n')+;

// Comments
LINE_COMMENT
    :   '//' ~[\r\n]* -> channel(HIDDEN) ;

// Symbols
TAG_START: '#';
COMMAND_START: '{' -> pushMode(INSIDE_COMMAND) ;

// Types
NUMBER: DIGIT+ ([.,] DIGIT+)? ;
INT: DIGIT+ ;
TEXT: ~([#{\r\n])*;

mode INSIDE_COMMAND;

	COMMAND_START_PARAMS: ':';
	WORD: (LOWERCASE | UPPERCASE | '_')+ ;
	VARIABLE_START: '@';
	
	COMMAND_END: '}' -> popMode;