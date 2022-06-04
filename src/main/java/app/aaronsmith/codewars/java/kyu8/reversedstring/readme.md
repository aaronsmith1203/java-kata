# Reversed Strings
https://www.codewars.com/kata/5168bb5dfe9a00b126000018/train/java

## Instructions
Complete the solution so that it reverses the string passed into it.

```txt
'world'  =>  'dlrow'
'word'   =>  'drow'
```

## PEDAC
### Problem
- input: String
- output: String

### Examples
'world'  =>  'dlrow'
'word'   =>  'drow'

See `ReversedStringTest.java` for test cases.

### Data Structure
#### Solution #1
- `StringBuilder` class

#### Solution #2
- Collection of `char` primitives

### Algorithm
#### Solution #1: reverse using StringBuilder
- Initialise StringBuilder `sb` and assign input `str` to it
- use `sb.reverse()` to reverse the order of the string
- convert `sb` to a string
- return string

#### Solution #2: reverse using array of characters
- convert input String `str` to array of char `chars`
- create an array of chars to hold reversed characters (`charsReversed`)
  - length of `charsReversed` same as `chars`
- loop `i` while less than `chars.length`
  - get each `char` in reverse order
    - `char[char.length() - 1 - i]`
  - add `char` to `charsReversed` in loop order
    - `charsReversed[i]`
  - `chars`.index
- convert `charsReversed` to a string
- return string