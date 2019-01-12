lexer grammar MurMurLexer;

// Formats
fragment LOWERCASE : [a-z] ;
fragment UPPERCASE : [A-Z] ;
fragment DIGIT : [0-9] ;
fragment TAG : '#' ;

// Extras
WHITESPACE: (' ' | '\t')+ -> skip;
NEWLINE: ('\n' | '\r' | '\r\n')+;

// Comments
LINE_COMMENT: '//' ~[\r\n]* -> channel(HIDDEN) ;
COMMENT: '/*' .*? '*/' -> channel(HIDDEN) ;

// Symbols
TAG_START: (TAG);
COMMAND_START: ('{') -> pushMode(INSIDE_COMMAND) ;

INCLUDE_KEYWORD: '@include' -> pushMode(INSIDE_COMMAND);
INIT_KEYWORD: '@init' -> pushMode(INSIDE_COMMAND);
TEXT: (~([#@{\r\n/[]) | ('/'~([/*])))+;


mode INSIDE_COMMAND;
    NEW_TAG: ('\n' | '\r' | '\r\n'){_input.La(1)=='#'}? -> popMode;
	NEW_DECLARATION: ('\n' | '\r' | '\r\n'){_input.La(1)=='@'}? -> popMode;
	//NEW_TAG: ('\n' | '\r' | '\r\n'){_input.LA(1)=='#'}? -> popMode; // Java version, for testing
	COMMAND_NEWLINE: ('\n' | '\r' | '\r\n')(~[#]);

	COMMAND_IGNORE: (' ' | '\t')+ -> skip;
	
	// Comments
	COMMAND_LINE_COMMENT: '//' ~[\r\n]* -> channel(HIDDEN);
	COMMAND_COMMENT: '/*' .*? '*/' -> channel(HIDDEN) ;

//	COMMAND_IGNORE: (' ' | '\t' | '\n' | '\r' | '\r\n')+ -> skip;

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
	WORD: (LOWERCASE | UPPERCASE | '_')( LOWERCASE | UPPERCASE | '_' | DIGIT )+;


	// Operations
	ASSIGN_SIGNAL: ('=');
	COMPARISSON_SIGNAL: ('==' | '!=' | '>' | '<' | '>=' | '<=');
	MUL_DIV_SIGNAL: '*'|'/'{_input.La(1)!='*'}?{_input.La(1)!='/'}?;
	//MUL_DIV_SIGNAL: '*'|'/'{_input.LA(1)!='*'}?{_input.LA(1)!='/'}?; // Java version, for testing
	ADD_SUB_SIGNAL: '+'|'-';
	

mode STRING_MODE;
	STRING: (~[\]])+;
	COMMAND_STRING_END: (']')-> popMode;
