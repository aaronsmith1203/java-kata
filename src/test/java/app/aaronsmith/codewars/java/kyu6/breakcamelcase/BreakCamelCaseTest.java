package app.aaronsmith.codewars.java.kyu6.breakcamelcase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BreakCamelCaseTest {

    @Test
    public void camelCaseTest1() {
        final String INPUT = "camelCasing";
        final String EXPECTED = "camel Casing";
        assertEquals(EXPECTED, BreakCamelCase.camelCase(INPUT));
    }

    @Test
    public void camelCaseTest2() {
        final String INPUT = "identifier";
        final String EXPECTED = "identifier";
        assertEquals(EXPECTED, BreakCamelCase.camelCase(INPUT));
    }

    @Test
    public void camelCaseTest3() {
        final String INPUT = "";
        final String EXPECTED = "";
        assertEquals(EXPECTED, BreakCamelCase.camelCase(INPUT));
    }

    @Test
    public void camelCaseTest4() {
        final String INPUT = "camelCasingIsSuperFun";
        final String EXPECTED = "camel Casing Is Super Fun";
        assertEquals(EXPECTED, BreakCamelCase.camelCase(INPUT));
    }

}
