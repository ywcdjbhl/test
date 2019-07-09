package com.you.test;

import java.util.Arrays;

public class Test476 {
    public static void main(String[] args) {
        Test476[] tests = new Test476[4];
        tests[0] = new Test476();
        tests[1] = new Test476();
        Test476[] tests2 = Arrays.copyOf(tests, 6);
        System.err.println(tests[0] == tests2[0]);
        System.err.println(tests[1] == tests2[1]);
    }
}
