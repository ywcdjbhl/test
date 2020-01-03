package com.you.test;

public class Test603 {
    public static void main(String[] args) {
        Throwable th = new Throwable();
        th.initCause(th);
    }
}
