package app.aaronsmith.codewars.java.kyu5.humanreadabletime;

import static app.aaronsmith.codewars.java.kyu5.humanreadabletime.HumanReadableTime.makeReadable;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HumanReadableTimeTest {

    
    @Test
    public void testCase1() {
        final int INPUT = 0;
        final String EXPECTED = "00:00:00";
        assertEquals(EXPECTED, makeReadable(INPUT));
    }
    
    @Test
    public void testCase2() {
        final int INPUT = 5;
        final String EXPECTED = "00:00:05";
        assertEquals(EXPECTED, makeReadable(INPUT));
    }
    
    @Test
    public void testCase3() {
        final int INPUT = 59;
        final String EXPECTED = "00:00:59";
        assertEquals(EXPECTED, makeReadable(INPUT));
    }
    
    @Test
    public void testCase4() {
        final int INPUT = 60;
        final String EXPECTED = "00:01:00";
        assertEquals(EXPECTED, makeReadable(INPUT));
    }
    
    @Test
    public void testCase5() {
        final int INPUT = 119;
        final String EXPECTED = "00:01:59";
        assertEquals(EXPECTED, makeReadable(INPUT));
    }
    
    @Test
    public void testCase6() {
        final int INPUT = 3599;
        final String EXPECTED = "00:59:59";
        assertEquals(EXPECTED, makeReadable(INPUT));
    }

    @Test
    public void testCase7() {
        final int INPUT = 3600;
        final String EXPECTED = "01:00:00";
        assertEquals(EXPECTED, makeReadable(INPUT));
    }

    @Test
    public void testCase8() {
        final int INPUT = 3659;
        final String EXPECTED = "01:00:59";
        assertEquals(EXPECTED, makeReadable(INPUT));
    }

    @Test
    public void testCase9() {
        final int INPUT = 3660;
        final String EXPECTED = "01:01:00";
        assertEquals(EXPECTED, makeReadable(INPUT));
    }

    @Test
    public void testCase10() {
        final int INPUT = 3661;
        final String EXPECTED = "01:01:01";
        assertEquals(EXPECTED, makeReadable(INPUT));
    }

    @Test
    public void testCase11() {
        final int INPUT = 86399;
        final String EXPECTED = "23:59:59";
        assertEquals(EXPECTED, makeReadable(INPUT));
    }

    @Test
    public void testCase12() {
        final int INPUT = 86400;
        final String EXPECTED = "24:00:00";
        assertEquals(EXPECTED, makeReadable(INPUT));
    }

    @Test
    public void testCase13() {
        final int INPUT = 359999;
        final String EXPECTED = "99:59:59";
        assertEquals(EXPECTED, makeReadable(INPUT));
    }
}
