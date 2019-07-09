package com.you.test;

public class Test354 {
    public static void main(String[] args) {
        for (int i = Integer.MAX_VALUE; ; i--) {
            if (i >> 8 == 0) {
                System.err.println(i);
            }
            if (i == Integer.MIN_VALUE) {
                break;
            }
        }
    }
}
