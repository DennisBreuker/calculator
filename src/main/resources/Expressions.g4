grammar Expressions;

expression : INT | expression DIVTIMES expression | expression SUBADD expression;

DIVTIMES: DIVIDE | TIMES ;
SUBADD: PLUS | SUBSTRACT ;
PLUS: '+' ;
SUBSTRACT: '-' ;
TIMES: '*' ;
DIVIDE: '/';
INT : [1-9]+[0-9]* ;
WS : [ \t\r\n]+ -> skip ;