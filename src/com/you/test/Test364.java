package com.you.test;

import java.io.PrintStream;

public class Test364 {
    char c;
    public static void main(String[] args) {
        Test364 test = new Test364();
        PrintStream err = System.err;
        char cc = test.c;
        err.println(test.c + 1);
        err.println(cc == '\u0000');
        err.println(cc == 0);
    }
}
