grammar Grammar;

import Tokenizer;

program
	: sentencias
	;
	
sentencias
	: sentencia*
	;

sentencia
	: defVar ';'
	| defStruct
	| defFunc
	| 'print' expr ';'
	| expr '=' expr ';'
	;
	
defVar
	: 'var' IDENT ':' tipo
	;
	
defStruct
	: 'struct' IDENT_STRUCT '{' campoStruct* '}'
	;

campoStruct 
	: IDENT ':' tipo ';'
	;
	
defFunc
	: IDENT '(' defArgsOpt ')' retorno? '{' sentencias '}'
	;
	
defArgsOpt
	: defArgs
	|
	;
	
defArgs
	: IDENT ':' tipo
	| IDENT ':' tipo ',' defArgs
	;
		
retorno 
	: ':' tipo
	;
	
callFunc
	: IDENT '(' callArgsOpt ');'
	;
	
callArgsOpt
	: callArgs
	| 
	;
	
callArgs
	: expr
	| expr ',' callArgs
	;
	
tipo
	: 'int'
	| 'float'
	| 'char'
	| IDENT_STRUCT
	| array tipo
	;
	
array
	: '[' INT_LITERAL ']'
	;

expr
	: INT_LITERAL
	| REAL_LITERAL
	| CHAR_LITERAL
	| IDENT
	| expr '[' expr ']'
	| expr '.' IDENT
	| callFunc
	| '<' tipo '>' '(' expr ')'
	| expr ('*'|'/') expr
	| expr ('+'|'-') expr
	;
	