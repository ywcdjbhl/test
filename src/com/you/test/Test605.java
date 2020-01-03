package com.you.test;

public class Test605 {
    public static void main(String[] args) {
        Throwable th = new Throwable();
        Throwable th2 = new Throwable();
        th.initCause(th2);
        th.initCause(th2);
    }
}
