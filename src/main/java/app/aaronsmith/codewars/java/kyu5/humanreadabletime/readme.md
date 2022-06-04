# Human Readable Time (5 kyu)
https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java

## Instructions
Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS).

- HH = hours, padded to 2 digits, range: 00 - 99
- MM = minutes, padded to 2 digits, range: 00 - 59
- SS = seconds, padded to 2 digits, range: 00 - 59

## PEDAC
### Problem
- input: `int` (0 <= *seconds* <= 359999)
- output: `String` (format: "HH:MM:SS")

### Examples
    0 => "00:00:00"
    5 => "00:00:05"
    59 => "00:00:59"
    60 => "00:01:00"
    119 => "00:01:59"
    3599 => "00:59:59"
    3600 => "01:00:00"
    3659 => "01:00:59"
    3660 => "01:01:00"
    3661 => "01:01:01"
    86399 => "23:59:59"
    86400 => "24:00:00"
    359999 => "99:59:59"

See `HumanReadableTime.java` for test suite.

### Algorithm
- use division on input (`seconds`) to find the hours section
    - hours (`h`): `(int) seconds / 3600`
    - remainingSeconds using mod: `seconds % 3600`
- use division on remaining seconds from previous calculation minutes section
    - minutes (`m`): `(int) remainingSeconds / 60`
    - remaining seconds using mod: `remainingSeconds % 60`
- remainingSeconds should now hold the seconds section
    - seconds (`s`): `remainingSeconds`
- use concatenation to return in format "HH:MM:SS"
    - need a leading zero on single digit int values
