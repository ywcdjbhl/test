package com.you.test;

import java.io.PrintStream;

public class Test350 {
    public static void main(String[] args) {
        char c = '\u4eA0';
        PrintStream err = System.err;
        err.println(c);
        c = '\u4EB2';
        err.println(c);

    }
}
