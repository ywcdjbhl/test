package com.you.test;
import java.io.PrintStream;
import java.lang.ref.WeakReference;

public class Test498 {
    public static void main(String[] args) {
        PrintStream err = System.err;
        Test498_2 test = new Test498_2();
        WeakReference<Test498_2> wr = new WeakReference<>(new Test498_2());
        err.println(wr);
        test = null;
        Object object = wr.get();
        err.println(object);
        object = null;
        System.gc();
        object = wr.get();
        err.println(object);
        Object object2 = wr.get();
        err.println(object2);
    }
}

class Test498_2 {

    @Override
    public void finalize() {
        System.err.println("finalize");
    }
}
