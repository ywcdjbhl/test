package com.you.test;

import java.io.PrintStream;

public class Test353 {
    public static void main(String[] args) {
        int ch = 255;
        ch = ch >>> 8;
        PrintStream err = System.err;
        err.println(ch);
        ch = 256;
        ch = ch >>> 8;
        err.println(ch);
        ch = 127;
        ch = ch >>> 8;
        err.println(ch);


    }
}
