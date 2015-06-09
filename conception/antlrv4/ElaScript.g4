grammar ElaScript;

//Rules
script : BEGIN statement+ END;

statement : command | parallelized;

parallelized : SPLIT body JOIN;

body : statement+ (PARALLELSEPARATOR statement+)+;

command : (ScaleFunctions | WaitFunction) LP (RP | (param COMMA)* param RP) SEQUENCIALSEPARATOR;

paramList : param ( COMMA param )*;

param : NUMBER+;


ScaleFunctions:
	ScaleInInfra | ScaleOutInfra | ScaleUpInfra | ScaleDownInfra | ScaleInSoft | ScaleOutSoft | ScaleUpSoft | ScaleDownSoft
;

WaitFunction:'wait';
ScaleInInfra : 'scaleInInfra';
ScaleOutInfra :'scaleOutInfra';
ScaleUpInfra : 'scaleUpInfra';
ScaleDownInfra : 'scaleDownInfra';

ScaleInSoft : 'scaleInSoft';
ScaleOutSoft :'scaleOutSoft';
ScaleUpSoft : 'scaleUpSoft';
ScaleDownSoft : 'scaleDownSoft';

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

BEGIN : 'begin';
END : 'end';

WS : [ \t\r\n]+ -> skip ;
