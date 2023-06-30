package org.example;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
    }

    public static String squareDigits(int n) {
        int value = n;
        ArrayList<Integer> result = new ArrayList<>();
        while (value > 0) {
            result.add((value % 10) * (value % 10));
            value = value / 10;

        }
        result.toString();
        String concat = "";
        for (int a : result) {
            concat = result.get()
        }
        //Collections.reverse(result);
        return concat;
    }
}