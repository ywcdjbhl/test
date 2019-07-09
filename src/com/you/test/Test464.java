package com.you.test;

import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.reflect.Field;

public class Test464 {
    public static void main(String[] args) throws Exception {
        CopyOnWriteArrayList list = new CopyOnWriteArrayList();
        Class clazz = CopyOnWriteArrayList.class;
        Field field = clazz.getDeclaredField("array");
        field.setAccessible(true);
        Object object = field.get(list);
        System.err.println(object);
        System.err.println(((Object[])object).length);
    }
}
