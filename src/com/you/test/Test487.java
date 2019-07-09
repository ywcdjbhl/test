package com.you.test;

public class Test487 {
    public static void main(String[] args) {
        int a = -10;
        int index;
        String result = "";
        for (int i = 0; i < 32; i++) {
            index = 1 & (a >>> i);
            result = index + result;
        }
        System.err.println(result);
    }
}
