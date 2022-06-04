# Break camelCase (6kyu)
https://www.codewars.com/kata/5208f99aee097e6552000148

## Instructions
Complete the solution so that the function will break up camel casing, using a space between words.

## PEDAC
### Problem
- input: `String`
- output: `String`

### Examples
```txt
"camelCasing" => "camel Casing"
"identifier" => "identifier"
"" => ""
```

See `BreakCamelCaseTest.java` for test suite.

### Algorithm
- initialise a String to hold the output
- iterate through characters `c` of `input` String
- if `c` in range of ASCII values for capital letters (65-90)
- add a space ' ', and `c` to output String
- else: add `c` to output String
- return output
