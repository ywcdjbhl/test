package com.you.test;

import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

public class Test515 {
    public static void main(String[] args) throws Exception {

        PrintStream err = System.err;
        Class clazzWeakHashMap = WeakHashMap.class;
        err.println(clazzWeakHashMap);
        Field fieldqueue = clazzWeakHashMap.getDeclaredField("queue");
        err.println(fieldqueue);
        fieldqueue.setAccessible(true);
        WeakHashMap map = new WeakHashMap();
        Object objectqueue = fieldqueue.get(map);
        err.println(objectqueue);
        WeakHashMap map2 = new WeakHashMap();
        Object objectqueue2 = fieldqueue.get(map2);
        err.println(objectqueue2);
    }
}
