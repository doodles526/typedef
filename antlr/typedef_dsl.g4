grammar typedef_dsl;

/*
 * Parser
 */
statements: literal_statement+ EOF;

literal_statement: VARIABLE_NAME VARIABLE_NAME_SEPERATOR phrase END_OF_STATEMENT ;

phrase: ((type_decl WS* value) | (STRUCT struct_members)) ;

// type definitions
type_decl: (type_with_context | TYPE_LITERAL) ;

type_with_context: TYPE_CONTEXTABLE type_context ;

type_context: OPEN_CONTEXT type_decl (VALUE_SEPERATOR type_decl)* CLOSE_CONTEXT ;


// literal value definitions
value: (BOOLEAN_VALUE | NUMBER | STRING_LITERAL | nested_value) ;

nested_value: OPEN_BRACKET (value | multiple_values | key_value_pair) CLOSE_BRACKET VALUE_SEPERATOR?;

multiple_values: value (VALUE_SEPERATOR value)* ;

key_value_pair: value KEY_SEPERATOR value ;

struct_members: OPEN_BRACKET VARIABLE_NAME type_decl (NEWLINE+ VARIABLE_NAME type_decl)* CLOSE_BRACKET ;


/*
 * Lexar
 */


// definitions for literal values

NUMBER: (INTEGER | FLOAT | BINARY | HEX) ;

fragment INTEGER: '-'? '1'..'9' '0'..'9'* ;
fragment FLOAT: '-'? '1'..'9' '0'..'9'* '.'? '0'..'9'+ ;
fragment BINARY: '0b' ('0' | '1')+ ;
fragment HEX: '0x' '0'..'9'+ ;

STRING_LITERAL: '"' (ESC | ~'"')* '"' ;

fragment ESC: '\\' . ;

WS: [ \t] -> skip ;
NEWLINE: [\r\n] -> skip ;


BOOLEAN_VALUE 
	: BOOLEAN_TRUE
	| BOOLEAN_FALSE
	;
fragment BOOLEAN_TRUE: 'true';
fragment BOOLEAN_FALSE: 'false';

// definitions for type values
TYPE_LITERAL: (INT_TYPE | STRING_TYPE | BOOLEAN_TYPE | FLOAT) ;
TYPE_CONTEXTABLE: (SET_TYPE | MAP_TYPE | ARRAY_TYPE) ;

fragment SET_TYPE: 'set' ;
fragment MAP_TYPE: 'map' ;
fragment ARRAY_TYPE: 'array' ;
fragment INT_TYPE: 'int';
fragment STRING_TYPE: 'string';
fragment BOOLEAN_TYPE: 'bool';
fragment FLOAT_TYPE: 'float';



// struct is unique from other literal types
STRUCT: 'struct' ;

VARIABLE_NAME_SEPERATOR: '->' ;

// mandate lower-case beginning with Camel Case
VARIABLE_NAME: ('a'..'z' | ('a'..'z' (ALPHA_NUMERIC | '-' | '_')* ALPHA_NUMERIC )) ;

fragment ALPHA_NUMERIC: ('a'..'z' | '0'..'9' | 'A'..'Z')+ ;

// SPECIAL CHARS

OPEN_PAREN: '(' ;
CLOSE_PAREN: ')' ;

OPEN_BRACKET: '{' ;
CLOSE_BRACKET: '}' ;

KEY_SEPERATOR: ':' ;

VALUE_SEPERATOR: ',' ;

END_OF_STATEMENT: ';' ;

OPEN_CONTEXT: '<' ;
CLOSE_CONTEXT: '>' ;
