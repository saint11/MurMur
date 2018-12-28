lexer grammar MurMurLexer;

// Formats
fragment LOWERCASE : [a-z] ;
fragment UPPERCASE : [A-Z] ;
fragment COMMENT_ESCAPE : '//';
fragment DIGIT : [0-9] ;
fragment TAG : '#' ;

// Extras
WHITESPACE: (' ' | '\t')+ -> skip;
NEWLINE: ('\n' | '\r' | '\r\n')+;

// Comments
LINE_COMMENT: '//' ~[\r\n]* -> channel(HIDDEN) ;

// Symbols
TAG_START: (TAG);
COMMAND_START: ('{') -> pushMode(INSIDE_COMMAND) ;
FAST_PICK_START: ('[') -> pushMode(FAST_PICK) ;

INCLUDE_KEYWORD: '@include' -> pushMode(INSIDE_COMMAND);
TEXT: (~([#@{\r\n/[]) | ('/'~'/'))+;


mode INSIDE_COMMAND;
	COMMAND_NEWLINE: ('\n' | '\r' | '\r\n')(~[#]);
	NEW_TAG: ('\n' | '\r' | '\r\n') -> popMode;

//	COMMAND_IGNORE: (' ' | '\t' | '\n' | '\r' | '\r\n')+ -> skip;
	COMMAND_IGNORE: (' ' | '\t')+ -> skip;

	COMMAND_PARAMS_START:(':');
	COMMAND_STRING_START:('[') -> pushMode(STRING_MODE); //go is an exception and allows free text input

	OPEN_PAREN: ('(');
	CLOSE_PAREN: (')');

	COMMAND_PARAMS_SEPARATOR: (',');
	
	COMMAND_END: ('}') -> popMode;

	// Fragments
	fragment T : ('T' | 't');
	fragment R : ('R' | 'r');
	fragment U : ('U' | 'u');
	fragment E : ('E' | 'e');
	fragment F : ('F' | 'f');
	fragment A : ('A' | 'a');
	fragment L : ('L' | 'l');
	fragment S : ('S' | 's');

	// Keywords
	KEYWORD_IF: ('if');
	KEYWORD_ELSE: ('else');
	KEYWORD_END: ('end');
	KEYWORD_GOTO: ('go');
	KEYWORD_MENU: ('menu');
	KEYWORD_MENU_OPTION: ('option');
	KEYWORD_PICK: ('pick');
	KEYWORD_PICK_THIS: ('this');
	TRUE: T R U E;
	FALSE: F A L S E;

	// Expressions
	NUMBER: DIGIT+ ([.] DIGIT+)?;
	WORD: (LOWERCASE | UPPERCASE | '_')+;

	// Comparisson
	ASSIGN_SIGNAL: ('=');
	COMPARISSON_SIGNAL: ('==' | '!=' | '>' | '<' | '>=' | '<=');
	MUL_DIV_SIGNAL: '*'|'/';
	ADD_SUB_SIGNAL: '+'|'-';

mode FAST_PICK;
	SUB_TEXT_SEPARATOR: ('|');
	FAST_PICK_TEXT: (~([}\r\n/|\]]) | '/'~'/')+;
	FAST_PICK_END: (']')  -> popMode;

mode STRING_MODE;
	STRING: (~[\]])+;
	COMMAND_STRING_END: (']')-> popMode;
