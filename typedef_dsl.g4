grammar typedef_dsl;

/*
 * Parser
 */
statements
	: literal_statement+ EOF
	;

literal_statement
	: VARIABLE_NAME VARIABLE_NAME_SEPERATOR phrase END_OF_STATEMENT
	;

phrase 
	: (type_decl WS* value) #valuePhrase
	| (STRUCT struct_members) #structPhrase
	;

// type definitions
type_decl
	: TYPE_EMBEDDED OPEN_EMBEDDED type_decl (VALUE_SEPERATOR type_decl)* CLOSE_EMBEDDED #embeddedType
	| TYPE_LITERAL #literalType
	;




// literal value definitions
value
	: BOOLEAN_VALUE #booleanValue
	| NUMBER #numberValue
	| STRING_LITERAL #stringValue // TODO: Do better string parsing
	| OPEN_SQUARE multiple_values? CLOSE_SQUARE VALUE_SEPERATOR? #arrayValue
	| OPEN_BRACKET multiple_values? CLOSE_BRACKET VALUE_SEPERATOR? #setValue
	| OPEN_BRACKET key_value_pair+ CLOSE_BRACKET VALUE_SEPERATOR? #mapValue
	;


multiple_values
	: value (VALUE_SEPERATOR value)* 
	;

key_value_pair
	: map_kv_key KEY_SEPERATOR map_kv_value VALUE_SEPERATOR?
	;


// Arrange key/vals like this to make easier flagging to handlers
map_kv_key
	: value
	;

// Arrange key/vals like this to make easier flagging to handlers
map_kv_value
	: value
	;

struct_members
	: OPEN_BRACKET VARIABLE_NAME type_decl (NEWLINE+ VARIABLE_NAME type_decl)* CLOSE_BRACKET
	;


/*
 * Lexar
 */


// definitions for literal values

NUMBER 
	: INTEGER 
	| FLOAT 
	| BINARY 
	| HEX 
	;

fragment INTEGER
	: '-'? '1'..'9' '0'..'9'* 
	;
fragment FLOAT
	: '-'? '1'..'9' '0'..'9'* '.'? '0'..'9'+ 
	;
fragment BINARY
	: '0b' ('0' | '1')+ 
	;
fragment HEX
	: '0x' '0'..'9'+
	;

STRING_LITERAL
	: '"' (ESC | ~'"')* '"' 
	;

fragment ESC
	: '\\' . 
	;

WS
	: [ \t] -> skip 
	;

NEWLINE
	: [\r\n] -> skip 
	;


BOOLEAN_VALUE 
	: BOOLEAN_TRUE
	| BOOLEAN_FALSE
	;

fragment BOOLEAN_TRUE
	: 'true'
	;
fragment BOOLEAN_FALSE
	: 'false'
	;

// definitions for type values
TYPE_LITERAL
	: INT_TYPE 
	| STRING_TYPE 
	| BOOLEAN_TYPE 
	| FLOAT_TYPE
	;
TYPE_EMBEDDED
	: SET_TYPE 
	| MAP_TYPE 
	| ARRAY_TYPE 
	;

fragment SET_TYPE
	: 'set'
	;
fragment MAP_TYPE
	: 'map' 
	;
fragment ARRAY_TYPE
	: 'array' 
	;
fragment INT_TYPE
	: 'int'
	;
fragment STRING_TYPE
	: 'string'
	;
fragment BOOLEAN_TYPE
	: 'bool'
	;
fragment FLOAT_TYPE
	: 'float'
	;



// struct is unique from other literal types
STRUCT
	: 'struct'
	;

VARIABLE_NAME_SEPERATOR
	: '->' 
	;

// mandate lower-case beginning with Camel Case?
VARIABLE_NAME
	: 'a'..'z' 
	| ('a'..'z' (ALPHA_NUMERIC | '-' | '_')* ALPHA_NUMERIC ) 
	;

fragment ALPHA_NUMERIC
	: 'a'..'z' 
	| '0'..'9' 
	| 'A'..'Z'+ 
	;

// SPECIAL CHARS

OPEN_PAREN
	: '(' 
	;
CLOSE_PAREN
	: ')' 
	;

OPEN_BRACKET
	: '{' 
	;
CLOSE_BRACKET
	: '}' 
	;

OPEN_SQUARE
	: '[' 
	;
CLOSE_SQUARE
	: ']' 
	;

KEY_SEPERATOR
	: ':' 
	;

VALUE_SEPERATOR
	: ',' 
	;

END_OF_STATEMENT
	: ';' 
	;

OPEN_EMBEDDED
	: '<' 
	;
CLOSE_EMBEDDED
	: '>' 
	;
