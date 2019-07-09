package com.you.test;

public class Test428 {
    public static void main(String[] args) {
        int i = -5;
        short s = (short) i;
        System.err.println(s);
        i = 5;
        s = (short) i;
        System.err.println(s);
        i = 524280;
        s = (short) i;
        System.err.println(s);
        s = -1;
        i = (int) s;
        System.err.println(i);
        i = Short.toUnsignedInt(s);
        System.err.println(i);
    }
}
