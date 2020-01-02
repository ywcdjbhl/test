package com.you.test;

public class Test601 {
    public static void main(String[] args) {
        Throwable th = new Throwable();
        Throwable th2 = th.getCause();
        System.err.println(th2 == null);
    }
}
