package com.you.test;

import java.util.concurrent.atomic.AtomicIntegerArray;

// debug一步步的走
public class Test533 {
    public static void main(String[] args) {
        AtomicIntegerArray array = new AtomicIntegerArray(5);
        boolean flag = array.compareAndSet(2, 0, 5);
        System.err.println(flag);
        flag = array.compareAndSet(4, 11, 5);
        System.err.println(flag);
    }
}
