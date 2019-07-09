package com.you.test;

import java.io.PrintStream;
import java.lang.ref.Reference;
import java.lang.reflect.Field;

/**
 * msdp的actoin里用的
 */
public class Test509 {
    public static void main(String[] args) throws Exception {
        PrintStream err = System.err;
        Class clazzThread = Thread.class;
        err.println(clazzThread);
        Field field = clazzThread.getDeclaredField("threadLocals");
        err.println(field);
        field.setAccessible(true);
        Thread t = Thread.currentThread();
        Object object = field.get(t);
        err.println(object);
        Class clazzThreadLocalMap = object.getClass();
        err.println(clazzThreadLocalMap);
        Field fieldtable = clazzThreadLocalMap.getDeclaredField("table");
        err.println(fieldtable);
        fieldtable.setAccessible(true);
        Object object2 = fieldtable.get(object);
        err.println(object2);
        Object[] objects = (Object[]) object2;
        err.println(objects);
        err.println(objects.length);
        Object entry = objects[0];
        err.println(entry);
        Class clazzentry = entry.getClass();
        err.println(clazzentry);
        Field fieldvalue = clazzentry.getDeclaredField("value");
        err.println(fieldvalue);
        fieldvalue.setAccessible(true);
        Object object3 = fieldvalue.get(entry);
        err.println(object3);
        Class clazzReference = Reference.class;
        err.println(clazzReference);
        Field fieldreferent = clazzReference.getDeclaredField("referent");
        err.println(fieldreferent);
        fieldreferent.setAccessible(true);
        Object object4 = fieldreferent.get(entry);
        err.println(object4);
    }
}
