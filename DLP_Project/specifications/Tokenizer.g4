lexer grammar Tokenizer;

INT_LITERAL
	: [0-9]+
	;
	
REAL_LITERAL 
	: [0-9]+ '.' [0-9]+
	;

CHAR_LITERAL
	: '\'' ~[\t\r\n] '\''
	| '\'\\n\''
	;

IDENT
	: [a-z][a-zA-Z0-9]*
	;
	
IDENT_STRUCT
	: [A-Z][a-zA-Z0-9]*
	;

LINE_COMMENT
	: '//' .*? ('\n' | EOF) -> skip
	;

MULTILINE_COMMENT
	: '/*' .*? '*/' -> skip
	;

WHITESPACE
	: [ \t\r\n]+ -> skip
	;
