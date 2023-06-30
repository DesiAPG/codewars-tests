package org.example;

/*
Clock shows h hours, m minutes and s seconds after midnight.

Your task is to write a function which returns the time since midnight in milliseconds.
Example:

h = 0
m = 1
s = 1

result = 61000
Input constraints:

    0 <= h <= 23
    0 <= m <= 59
    0 <= s <= 59


*/
public class Clock {
    public static int Past(int h, int m, int s) {
        int hour = 3600000;
        int minute = 60000;
        int second = 1000;
        return (hour * h) + (minute * m) + (second * s);

    }
}