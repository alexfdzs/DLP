grammar Grammar;

import Lexicon;

start : data code;

data : 'DATA' variables;

code : 'CODE' sentencias;

variables : defVar
			| variables defVar ;

defVar : tipo IDENT ';' ;

tipo : 'real' | 'int' ;

sentencias: sentencia
			| sentencias sentencia;

sentencia : 'read' IDENT ';'
			| 'print' expr ';'
			| condicional
			| IDENT '=' expr  ';'
			| func ';';
			
condicional : 'if' condicion cuerpoCondicion
			 | 'while' condicion cuerpoCondicion
			 | 'else' cuerpoCondicion ;
			 
			 
condicion : '(' expr ')';

cuerpoCondicion :  '{' sentencias '}';

operador : '+' | '!=' ;

expr : IDENT
	  | LITENT
	  | LITREAL
	  | expr operador expr
	  | '(' expr ')'
	  | cast '(' expr ')'
	  | func ;
	  
	  
cast : '<' tipo '>';

func : IDENT '(' argsOpt ')';

argsOpt : args
		  | ;

args : expr
	  | args ',' args;
			
