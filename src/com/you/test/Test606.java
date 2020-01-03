package com.you.test;

public class Test606 {
    public static void main(String[] args) {
        Throwable th = new Throwable();
        Throwable th2 = new Throwable();
        th.initCause(th2);
        Throwable th3 = new Throwable();
        th.initCause(th3);
    }
}
