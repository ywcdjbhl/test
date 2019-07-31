package com.you.test;

import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class Test536 {
    public static void main(String[] args) throws Exception {
        PrintStream err = System.err;
        Class clazzAtomicIntegerArray = AtomicIntegerArray.class;
        err.println(clazzAtomicIntegerArray);
        Field fieldarray = clazzAtomicIntegerArray.getDeclaredField("array");
        err.println(fieldarray);
        fieldarray.setAccessible(true);
        int[] is = new int[] {4, 5, 6, 7, 8};
        AtomicIntegerArray array = new AtomicIntegerArray(is);
        Object objectarray = fieldarray.get(array);
        err.println(objectarray);
        err.println((objectarray == is));
        int ha = System.identityHashCode(objectarray);
        int ha2 = System.identityHashCode(is);
        err.println(ha);
        err.println(ha2);
    }
}
