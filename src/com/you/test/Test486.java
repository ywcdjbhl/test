package com.you.test;
import java.io.PrintStream;
public class Test486 {
    public static void main(String[] args) {
        PrintStream err = System.err;
        Class clazz = Test486_2.class;
        err.println(clazz);
        ClassLoader cl = clazz.getClassLoader();
        err.println(cl);
        ClassLoader cl2 = cl.getParent();
        err.println(cl2);
        ClassLoader cl3 = cl2.getParent();
        err.println(cl3);
        cl3.getParent();

    }
}

class Test486_2 {

}