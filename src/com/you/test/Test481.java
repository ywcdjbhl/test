package com.you.test;
import java.io.PrintStream;
public class Test481 {
    public static void main(String[] args) {
        Object[] objects = new Object[6];
        Double[] ds = new Double[2];
        ds[0] = 3D;
        ds[1] = 8D;
        System.arraycopy(ds, 0, objects, 0, 2);
        PrintStream err = System.err;
        for (int i = 0; i < objects.length; i++) {
            err.println(objects[i]);
        }
        err.println(objects[0] instanceof Double);
        err.println(objects[1] instanceof Double);
    }
}
