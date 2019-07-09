package com.you.test;
import java.io.PrintStream;
public class Test488 {
    public static void main(String[] args) {
        PrintStream err = System.err;
        err.println(args.length);
        err.println(args[0]);
        err.println(args[1]);
        err.println(args[2]);
    }
}
