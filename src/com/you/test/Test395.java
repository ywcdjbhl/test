package com.you.test;

public class Test395 {
    public static void main(String[] args) {
        int i = Math.max(200, 127);
        int j = Math.min(i, Integer.MAX_VALUE - 128 - 1);
        System.err.println(j);
    }
}
