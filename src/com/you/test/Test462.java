package com.you.test;

import java.util.concurrent.atomic.AtomicLong;

public class Test462 {
    public static void main(String[] args) {
        AtomicLong value = new AtomicLong(17);
        boolean flag = value.compareAndSet(17, 90);
        System.err.println(flag);
        System.err.println(value);
        flag = value.compareAndSet(91, 77);
        System.err.println(flag);
        System.err.println(value);
    }
}
