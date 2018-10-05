lexer grammar MurMurLexer;


@lexer::members {
    int lastTokenType = 0;
public void emit(Token token) {
    super.emit(token);
    lastTokenType = token.getType();
}
}

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
	COMMAND_PARAMS_START:
		(':')
		{ if (lastTokenType==KEYWORD_MENU) pushMode(TEXT_MODE); }; //Menu is an exception that allows text input

	COMMAND_PARAMS_SEPARATOR: (',');
	VARIABLE_START: '@';
	
	COMMAND_END: ('}') -> popMode;

	// Keywords
	KEYWORD_IF: ('if');
	KEYWORD_END: ('end');
	KEYWORD_MENU: ('menu');
	KEYWORD_PICK: ('pick');
	KEYWORD_PICK_THIS: ('this');

	WORD: (LOWERCASE | UPPERCASE | '_')+;

	// Expressions
	NUMBER: DIGIT+ ([.,] DIGIT+)?;
	INT: DIGIT+ ;

	// Comparisson
	COMPARISSON_SIGNAL: ('==' | '!=' | '>' | '<' | '>=' | '<=');
	OPERATION_SIGNAL: ('+'|'-'|'*'|'/');

mode FAST_PICK;
	SUB_TEXT_SEPARATOR: ('|');
	FAST_PICK_TEXT: (~([}\r\n/|\]]) | '/'~'/')+;
	FAST_PICK_END: (']')  -> popMode;

mode TEXT_MODE;
	SUB_TEXT: (~([}\r\n/|]) | '/'~'/')+ -> popMode;
