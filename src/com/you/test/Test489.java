package com.you.test;

public class Test489 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.err.println(runtime);
        long max = runtime.maxMemory();
        System.err.println(max);
    }
}
