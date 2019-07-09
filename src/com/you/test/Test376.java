package com.you.test;
import java.io.PrintStream;
public class Test376 {
    public static void main(String[] args) {
        int i = 2;
        PrintStream err = System.err;
        err.println(i >> 1);
        err.println(i >> 1 >> 1);
        i = -2;
        err.println(i >> 1);
        err.println(i >> 1 >> 1);
        err.println(-1 >> 1);

    }
}
