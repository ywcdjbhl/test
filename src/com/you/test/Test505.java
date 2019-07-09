package com.you.test;

import java.lang.ref.WeakReference;

public class Test505 {
    public static void main(String[] args) {
        WeakReference wr = new WeakReference(new Object());
        System.err.println(wr.get());
        System.gc();
        System.err.println(wr.get());
    }
}
