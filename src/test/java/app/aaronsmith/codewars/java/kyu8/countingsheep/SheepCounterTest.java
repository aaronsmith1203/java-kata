package app.aaronsmith.codewars.java.kyu8.countingsheep;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SheepCounterTest {

    @Test
    public void testCounter1() {
        final Boolean[] INPUT = {
                true, true, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true };
        final int EXPECTED = 17;
        final int ACTUAL = new SheepCounter().count(INPUT);
        assertEquals(EXPECTED, ACTUAL);
    }

    @Test
    public void testCounter2() {
        final Boolean[] INPUT = {
                false, false, false, false,
                false, false, false, false,
                false, false, false, false,
                false, false, true, false,
                true, false, false, false,
                false, false, false, false };
        final int EXPECTED = 2;
        final int ACTUAL = new SheepCounter().count(INPUT);
        assertEquals(EXPECTED, ACTUAL);
    }

    @Test
    public void testCounter3() {
        final Boolean[] INPUT = {
                null, null, null, null,
                false, false, false, false,
                null, null, null, null,
                null, null, true, null,
                true, null, null, null,
                null, null, null, null };
        final int EXPECTED = 2;
        final int ACTUAL = new SheepCounter().count(INPUT);
        assertEquals(EXPECTED, ACTUAL);
    }
}
