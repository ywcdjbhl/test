package com.you.test;
import java.io.PrintStream;
public class Test340 {
    public static void main(String[] args) {
        int i = -3;
        int j = 3;
        PrintStream err = System.err;
        err.println(i & j);
    }
}
