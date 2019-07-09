package com.you.test;

public class Test355 {
    public static void main(String[] args) {
        for (int i = Integer.MAX_VALUE; ; i--) {
            if (i >>> 16 == 16) {
                System.err.println(i);
            }
            if (i == Integer.MIN_VALUE) {
                break;
            }
        }
    }
}
