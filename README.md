# typedef

typedef is a DSL designed to define variable literals in a language-agnostic
format, and to facilitate generation of those literals for various languages.


## Typedef Grammar Format

Typedef utilizes grammar in the following form

`VARIABLE_NAME -> TYPE VALUE;`

Types/Values may be arbitrarily nested if the type is an embeddable collection
type. As an example:

```
example_set -> set<int> {1, 2, 3, 4, 5};

example_2d_array -> array<set<int>> [
	{1, 2, 3, 4, 5},
	{5, 6, 7, 8, 9},
	{10, 11, 12, 13},
]
```

### Valid Types

#### Collections

* set - denoted by `{val, val, val}` in value literals

* map - denoted by `{key: val, key: val, key: val}` in value literals

* array - denoted by `[val, val, val]` in value literals

#### Primitives

* int

* float

* bool

* string

It may be apparent that type declarations are technically redundant as all
types can be easily inferred by their values. Their existence is intended
solely to make reading the `.td` files easier. It potentially allows for some
languages to pre-process some type declarations. But this idea may be scrubbed
later.

## How to use

Currently, only basic use if finished. The Python handler is complete except
for dicts - but it should be abstracted more so we don't have to hard-code all the
languages - and instead describe prefix/suffix notations for various types.

```
./typedef.py ./examples/set.td

example_set = set(1,2,3,4,5)
```

## Next Steps

* Write additional per-language output generators

