example_arr -> array<int> [
	50, 60, 70
];

example_int -> int 57;

example_float -> int 57.82;

example_map -> map<string,int> {
	"test": 1234,
	"test1": 1235,
};

example_map_with_collection_val -> map<string, array<int>> {
	"test4": [1, 2, 3, 4],

};

example_2d_arr -> array<array<int>>
[
	[1, 2, 3, 4],
	[4, 5, 6, 7],
	[6, 7, 8, 9],
];

example_set -> set<int> {1, 2, 3, 4, 5};

example_string -> string "test";
