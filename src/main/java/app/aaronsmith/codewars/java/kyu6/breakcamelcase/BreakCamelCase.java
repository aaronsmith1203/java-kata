package app.aaronsmith.codewars.java.kyu6.breakcamelcase;

// https://www.codewars.com/kata/5208f99aee097e6552000148
// see `readme.md` for notes

public class BreakCamelCase {

    public static String camelCase(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 65 && input.charAt(i) <= 90) {
                output += " ";
            }
            output += String.valueOf(input.charAt(i));
        }
        return output;
    }
}
