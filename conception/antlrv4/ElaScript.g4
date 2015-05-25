grammar ElaScript;

//Rules
script : statement+;

statement : command | parallelized;

parallelized : SPLIT body JOIN;

body : statement+ (PARALLELSEPARATOR statement+)+;

command : function LP paramList* RP SEQUENCIALSEPARATOR;

function : LETTER (LETTER | NUMBER)*;

paramList : param ( COMMA param )*;

param : NUMBER+;

//Lexems
LP : '(';
RP : ')';
LETTER : [a-zA-Z];
NUMBER : [0-9];
TIMER : 'wait';
SEQUENCIALSEPARATOR : ';';
PARALLELSEPARATOR : '||';
COMMA : ',';
SPLIT : '[';
JOIN : ']';

WS : [ \t\r\n]+ -> skip ;
