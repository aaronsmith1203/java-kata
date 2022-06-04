package app.aaronsmith.codewars.java.kyu8.reversedstring;

import static app.aaronsmith.codewars.java.kyu8.reversedstring.ReversedString.reverse1;
import static app.aaronsmith.codewars.java.kyu8.reversedstring.ReversedString.reverse2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReversedStringTest {
    
    @Test
    public void reverse1_sample1() {
        final String INPUT = "world";
        final String EXPECTED = "dlrow";
        final String ACTUAL = reverse1(INPUT);

        assertEquals(EXPECTED, ACTUAL);
    }

    @Test
    public void reverse1_sample2() {
        final String INPUT = "word";
        final String EXPECTED = "drow";
        final String ACTUAL = reverse1(INPUT);

        assertEquals(EXPECTED, ACTUAL);
    }

    @Test
    public void reverse1_sample3() {
        final String INPUT = "Word";
        final String EXPECTED = "droW";
        final String ACTUAL = reverse1(INPUT);

        assertEquals(EXPECTED, ACTUAL);
    }

    @Test
    public void reverse1_sample4() {
        final String INPUT = "  This Is A Phrase";
        final String EXPECTED = "esarhP A sI sihT  ";
        final String ACTUAL = reverse1(INPUT);

        assertEquals(EXPECTED, ACTUAL);
    }

    @Test
    public void reverse1_sample5() {
        final String INPUT = "";
        final String EXPECTED = "";
        final String ACTUAL = reverse1(INPUT);

        assertEquals(EXPECTED, ACTUAL);
    }

    @Test
    public void reverse1_sample6() {
        final String INPUT = "  ";
        final String EXPECTED = "  ";
        final String ACTUAL = reverse1(INPUT);

        assertEquals(EXPECTED, ACTUAL);
    }

    @Test
    public void reverse2_sample1() {
        final String INPUT = "world";
        final String EXPECTED = "dlrow";
        final String ACTUAL = reverse2(INPUT);

        assertEquals(EXPECTED, ACTUAL);
    }

    @Test
    public void reverse2_sample2() {
        final String INPUT = "word";
        final String EXPECTED = "drow";
        final String ACTUAL = reverse2(INPUT);

        assertEquals(EXPECTED, ACTUAL);
    }

    @Test
    public void reverse2_sample3() {
        final String INPUT = "Word";
        final String EXPECTED = "droW";
        final String ACTUAL = reverse2(INPUT);

        assertEquals(EXPECTED, ACTUAL);
    }

    @Test
    public void reverse2_sample4() {
        final String INPUT = "  This Is A Phrase";
        final String EXPECTED = "esarhP A sI sihT  ";
        final String ACTUAL = reverse2(INPUT);

        assertEquals(EXPECTED, ACTUAL);
    }

    @Test
    public void reverse2_sample5() {
        final String INPUT = "";
        final String EXPECTED = "";
        final String ACTUAL = reverse2(INPUT);

        assertEquals(EXPECTED, ACTUAL);
    }

    @Test
    public void reverse2_sample6() {
        final String INPUT = "  ";
        final String EXPECTED = "  ";
        final String ACTUAL = reverse2(INPUT);

        assertEquals(EXPECTED, ACTUAL);
    }
}
