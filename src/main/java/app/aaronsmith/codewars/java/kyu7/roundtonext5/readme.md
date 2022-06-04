# Round up to the next multiple of 5 (7 kyu)
https://www.codewars.com/kata/55d1d6d5955ec6365400006d

## Instructions
Given an integer as input, can you round it to the next (meaning, "higher") multiple of 5?

Input may be any positive or negative integer (including 0). You can assume that all inputs are valid integers.

## PEDAC
### Problem
- inputs: integer value to test (always valid)
- outputs: integer value of next nearest multiple of five
- rules/reqs:
  - rounding up to next multiple of 5
  - if already multiple of 5, do not round up, just return same value

### Examples
```txt
0 -> 0
2 -> 5
3 -> 5
12 -> 15
21 -> 25
30 -> 30
-2 -> 0
-5 -> -5
```

ex 1) input = 2, output = 5
i need to add 3
remainder = 2 % 5 = 2
return (2 - 2 + 5) = 5

ex 2) input = 3, output = 5
i need to add 2
remainder = 3 % 5 = 3
return (9 - 4 + 5) = 10

ex 3) input = 30, output = 30
i need to add 0
remainder = 15 % 5 = 0
return (15 - 0 + 5)

ex 4) input = -3, output = 0
i need to add 3 
remainder = -3 % 5 = -3
return -3 -3 = 0

See `RoundToNext5Test.java` for test suite.

### Data Structures
- simple primitive integers in and out

### Algorithm
- get modulus of input divided by 5 (0-4)
- return value of (input - remainder + 5)
  - (input + (5 - remainder))
- find out how many away from multiple-of-five I am
  - 5 - mod5
