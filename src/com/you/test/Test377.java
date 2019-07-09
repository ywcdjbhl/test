package com.you.test;
import java.io.PrintStream;
public class Test377 {
    public static void main(String[] args) {
        int i = 1 & 0x7FFFFFFF;
        PrintStream err = System.err;
        err.println(i);
        i = -1 & 0x7FFFFFFF;
        err.println(i == Integer.MAX_VALUE);
    }
}
