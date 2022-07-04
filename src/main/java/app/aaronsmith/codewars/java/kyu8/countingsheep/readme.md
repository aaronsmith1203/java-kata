# Counting Sheep (8kyu)
https://www.codewars.com/kata/54edbc7200b811e956000556

## Instructions
Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the number of sheep present in the array (true means present).

*Hint*: Don't forget to check for bad values like null/undefined.

## PEDAC
### Problem
- input: `Boolean[]`
  - The template code provided for the solution has a `Boolean[]` parameter, not a `boolean[]`. This must be why `null` types have been mentioned in the instructions.
- output: `int`

### Examples
```txt
[true,  true,  true,  false,
 true,  true,  true,  true ,
 true,  false, true,  false,
 true,  false, false, true ,
 true,  true,  true,  true ,
 false, false, true,  true]
```

The correct answer would be `17`.

See `SheepCounterTest.java` for test suite.

### Algorithm
- initialise a counter with a value of 0
- initialise a for loop that iterates through the array of sheep
- inside the body of the loop:
  - if the element value is true, then iterate the counter
- return the value of the counter
