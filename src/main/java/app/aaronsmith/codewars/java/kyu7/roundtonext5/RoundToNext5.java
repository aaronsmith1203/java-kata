package app.aaronsmith.codewars.java.kyu7.roundtonext5;

// https://www.codewars.com/kata/55d1d6d5955ec6365400006d
// see `readme.md` for notes

public class RoundToNext5 {

    public static int roundToNext5(int number) {
        if (number % 5 == 0) return number;
        if (number > 0) {
            return (number - (number % 5) + 5);
        } else {
            return (number - (number % 5));
        }
    }
}
