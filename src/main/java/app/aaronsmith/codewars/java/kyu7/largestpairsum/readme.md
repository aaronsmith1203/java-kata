# Largest pair sum in array (7 kyu)
https://www.codewars.com/kata/556196a6091a7e7f58000018

## Instructions
Given a sequence of numbers, find the largest pair sum in the sequence.

Input sequence contains minimum two elements and every element is an integer.

## PEDAC
### Problem
- input: array of integers
- output: integer value which is the sum of the two largest input values
- rules/requirements
  - input array will always have a minimum of two integer values
  - input will only have integer values

### Examples
```txt
[10, 14, 2, 23, 19] -->  42 (= 23 + 19)
[99, 2, 2, 23, 19]  --> 122 (= 99 + 23)
```

See `LargestPairSumTest.java` for test suite.

### Data Structures
- primitive arrays and integers
- need to sort, so a List implementation

### Algorithm
- convert array to ArrayList
  - initialise an empty ArrayList
  - iterate through values of input array and add to Arraylist
- sort ArrayList from largest to smallest (reverse order)
- add 1st and 2nd integer values for largestPairSum
- return largestPairSum
