package com.you.test;

import java.io.PrintStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

public class Test508 {
    public static void main(String[] args) throws Exception {
        PrintStream err = System.err;
        WeakReference<Test508_2> wr = new WeakReference<>(new Test508_2());
        Class clazzReference = Reference.class;
        Class clazzwr = wr.getClass();
        err.println(clazzwr);
        err.println(clazzReference);
        Field fieldreferent = clazzReference.getDeclaredField("referent");
        err.println(fieldreferent);
        fieldreferent.setAccessible(true);
        Object objectreferent = fieldreferent.get(wr);
        err.println(objectreferent);
        objectreferent = null;
        System.gc();
        Object objectreferent2 = fieldreferent.get(wr);
        err.println(objectreferent2);
    }
}

class Test508_2 {

    PrintStream err = System.err;

    @Override
    public void finalize() throws Throwable {
        err.println("finalize");
        Thread t = Thread.currentThread();
        err.println(t);
    }

}
