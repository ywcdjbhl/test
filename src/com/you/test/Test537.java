package com.you.test;

public class Test537 {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        int i = run.availableProcessors();
        System.err.println(i);
    }
}
