package com.you.test;

import java.io.PrintStream;

public class Test351 {
    public static void main(String[] args) throws Exception {
        String s = "A";
        byte[] bs = s.getBytes();
        PrintStream err = System.err;
        for (byte b : bs) {
            err.println(b);
        }
        bs = s.getBytes("GBK");
        err.println("----------");
        for (byte b : bs) {
            err.println(b);
        }
        s = "假";
        bs = s.getBytes();
        err.println("----------");
        for (byte b : bs) {
            err.println(b);
        }
        bs = s.getBytes("UTF-16");
        err.println("----------");
        for (byte b : bs) {
            err.println(b);
        }
        bs = s.getBytes("UTF-32");
        err.println("----------");
        for (byte b : bs) {
            err.println(b);
        }
        bs = s.getBytes("GBK");
        err.println("----------");
        for (byte b : bs) {
            err.println(b);
        }
    }
}
