package app.aaronsmith.codewars.java.kyu7.mrscrooge;

// https://www.codewars.com/kata/563f037412e5ada593000114
// see `readme.md` for notes

public class MrScrooge {

    public static int calculateYears(
            double principal, double interestRate,
            double taxRate, double desired) {
        int years = 0;
        while (principal < desired) {
            years++;
            principal = principal + (principal * interestRate * (1.0-taxRate));
        }
        return years;
    }
}
