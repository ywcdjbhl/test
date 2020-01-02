package com.you.test;

import java.lang.reflect.Field;

public class Test602 {
    public static void main(String[] args) throws Exception {
        Class clazz = Throwable.class;
        System.err.println(clazz);
        Field fieldCause = clazz.getDeclaredField("cause");
        System.err.println(fieldCause);
        Throwable th = new Throwable();
        fieldCause.setAccessible(true);
        Object object = fieldCause.get(th);
        System.err.println(object);
        System.err.println(object == th);
        Object object3 = null;
        while (true) {
            Object object2 = fieldCause.get(object);
            System.err.println(object2 == object);
            object = object2;
            object2 = object3;
        }

    }
}
