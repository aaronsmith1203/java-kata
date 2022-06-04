package app.aaronsmith.codewars.java.kyu7.largestpairsum;

// https://www.codewars.com/kata/556196a6091a7e7f58000018
// see `readme.md` for notes

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestPairSum {
    public static int largestPairSum(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        list.sort(Collections.reverseOrder());
        return list.get(0) + list.get(1);
    }
}
