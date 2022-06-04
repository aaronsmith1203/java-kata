package app.aaronsmith.codewars.java.kyu7.roundtonext5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RoundToNext5Test {
    
    @Test
    public void roundToNext5BasicValidInputTests() {
        final int[] INPUT = {
            0, 2, 3, 12, 21, 30, -2, -5
        };
        final int[] EXPECTED = {
            0, 5, 5, 15, 25, 30, 0, -5
        };
        for (int i = 0; i < INPUT.length; i++) {
            assertEquals(EXPECTED[i], RoundToNext5.roundToNext5(INPUT[i]));
        }
    }
}
