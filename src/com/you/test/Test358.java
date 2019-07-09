package com.you.test;

import java.io.PrintStream;

public class Test358 {
    public static void main(String[] args) {
        int i = 22;
        i = i >> 3 << 3;
        PrintStream err = System.err;
        err.println(i);
    }
}
