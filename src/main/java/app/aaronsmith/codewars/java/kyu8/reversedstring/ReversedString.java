package app.aaronsmith.codewars.java.kyu8.reversedstring;

// https://www.codewars.com/kata/5168bb5dfe9a00b126000018/train/java
// see `readme.md` for notes

public class ReversedString {
    
    public static String reverse1(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static String reverse2(String str) {
        char[] chars = str.toCharArray();
        char[] charsReversed = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            charsReversed[i] = chars[chars.length - 1 - i];
        }
        return String.valueOf(charsReversed);
    }
}
