package com.github.budison.codingbat.logic2;

abstract class LuckySum {

    static int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        }

        if (b == 13) {
            return a;
        }

        if (c == 13) {
            return a + b;
        }

        return a + b + c;
    }
}