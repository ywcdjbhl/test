package com.you.test;

public class Test607 {
    public static void main(String[] args) {
        Throwable th = new Throwable();
        Throwable th2 = new Throwable();
        th.initCause(th2);
        Throwable th3 = new Throwable();
        th2.initCause(th3);
    }
}
