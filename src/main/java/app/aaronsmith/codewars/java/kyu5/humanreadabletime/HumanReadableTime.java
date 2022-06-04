package app.aaronsmith.codewars.java.kyu5.humanreadabletime;

// https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java
// see `readme.md` for notes

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int h = seconds / 3600;
        int m = (seconds % 3600) / 60;
        int s = seconds % 3600 % 60;
        return String.format("%02d:%02d:%02d", h, m, s);
    }
}
