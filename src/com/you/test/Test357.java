package com.you.test;

import java.io.PrintStream;

public class Test357 {
    public static void main(String[] args) {
        char c = '\u4800';
        PrintStream err = System.err;
        err.println(c);
        c = '\u100F';
        err.println(c);
        // 1001000 00000000  // \u4800 |
        //   10000 00001111  // \u100F
        // 1011000 00001111  // \u580f
        boolean flag = ('\u100F' | '\u4800') == '\u580f';
        err.println(flag);
    }
}
