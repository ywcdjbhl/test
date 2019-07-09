package com.you.test;

import java.util.ArrayList;
import java.util.List;
import java.io.PrintStream;
public class Test504 {
    public static void main(String[] args) {
        List<byte[]> list = new ArrayList<>();
        PrintStream err = System.err;
        int count = 0;
        for (int i = 0; i < 10000000; i++) {
            byte[] bs = new byte[1000000];
            list.add(bs);
            err.println(count);
            count = count + 1;
        }
    }
}
