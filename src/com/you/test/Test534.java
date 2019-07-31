package com.you.test;

import java.util.concurrent.atomic.AtomicIntegerArray;
// 一步一步debug
public class Test534 {
    public static void main(String[] args) {
        int[] is = new int[] {4, 5, 6, 7, 8};
        AtomicIntegerArray array = new AtomicIntegerArray(is);
        boolean flag = array.compareAndSet(2, 6, 10);
        System.err.println(flag);
        flag = array.compareAndSet(4, 12, 2);
        System.err.println(flag);
    }
}
