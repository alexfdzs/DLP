/*
Aadir EN ESTE ORDEN:
- Identificadores. Deben empezar por letra y luego puede ser letra, dígito o subrayado '_'.
- Palabras reservadas: read, print, int y float.
- Operadores aritméticos y otros simbolos:  + - = ;
- Literales reales: 3.15, 78.23, ... (parte entera obligatoria/ parte decimal OBLIGATORIA).
- Comentarios de una línea y multilinea (como en Java).

- Tarea OBLIGATORIA para casa -> Ver "Tarea.pdf"
*/

lexer grammar Lexicon;

LITENT : [0-9]+;

READ : 'read';
PRINT : 'print';
INT : 'int';
FLOAT : 'float';

MAS : '+';
MENOS : '-';
IGUAL : '=';
PCOMA : ';';

IDENT : [a-zA-Z][_a-zA-Z0-9]*;


LITREAL : [0-9]+ '.' [0-9]*;

LINE_COMMENT : '//'.*?'\n' -> skip;
MULTILNE_COMMENT : '/*'.*?'*/' -> skip;


WHITESPACE : [ \t\r\n]+ -> skip;
