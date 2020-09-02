package com.you.test;

public class Test774 {
    public static void main(String[] args) {
        Long l = new Long(333);
        Long l2 = new Long(333);
        System.err.println(l == 333);
        System.err.println(l2 == 333);
        System.err.println(l2 == l);
    }
}
