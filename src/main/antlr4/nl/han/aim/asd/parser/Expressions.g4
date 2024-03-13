grammar Expressions;

start: expression;
expression:
    INT
    | expression DIVTIMES expression
    | expression SUBADD expression;

DIVTIMES: DIVIDE | TIMES ;
SUBADD: PLUS | SUBSTRACT ;
PLUS: '+' ;
SUBSTRACT: '-' ;
TIMES: '*' ;
DIVIDE: '/';
INT : [0-9]+;
WS : [ \t\r\n]+ -> skip ;