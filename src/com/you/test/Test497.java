package com.you.test;
import java.io.PrintStream;
import java.lang.ref.SoftReference;

public class Test497 {
    public static void main(String[] args) {
        PrintStream err = System.err;
        Test497_2 test = new Test497_2();
        SoftReference<Test497_2> soft = new SoftReference<>(test);
        test = null;
        Object object = soft.get();
        err.println(object);
        System.gc();
        Object object2 = soft.get();
        err.println(object2);
        byte[] bs = new byte[1024 * 925 * 7];
        System.gc();
        Object object3 = soft.get();
        err.println(object3);

    }
}

class Test497_2 {

}
