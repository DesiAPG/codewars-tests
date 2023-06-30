package org.example;

import java.util.ArrayList;
import java.util.Collections;


/*

Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)

Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-25)

Note: The function accepts an integer and returns an integer.
 */
public class SquareEveryDigit {
    public static int squareDigits(int n) {
        int value = n;
        ArrayList<Integer> result = new ArrayList<>();
        while (value > 0) {
            result.add((value % 10) * (value % 10));
            value = value / 10;

        }

        if (result.isEmpty()) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        Collections.reverse(result)
        for (Integer num : result) {
            sb.append(num);
        }
        int res = Integer.parseInt(sb.toString());

        return res;
    }
}
