lexer grammar Lexicon;

LITENT : [0-9]+;

LITREAL : [0-9]+'.'[0-9]*;

IDENT : [a-zA-Z][_a-zA-Z0-9]*;

COMMENT : '/*' .*? '*/' -> skip;

WS : [ \t\r\n]+ -> skip;
