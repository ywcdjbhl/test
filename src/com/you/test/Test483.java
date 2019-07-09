package com.you.test;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.concurrent.ThreadLocalRandom;

public class Test483 {
    public static void main(String[] args) throws Exception {
        PrintStream err = System.err;
        Class clazz = Thread.class;
        Thread t = new Thread();
        err.println(clazz);
        Field field = clazz.getDeclaredField("threadLocalRandomSeed");
        Field field2 = clazz.getDeclaredField("threadLocalRandomProbe");
        Field field3 = clazz.getDeclaredField("threadLocalRandomSecondarySeed");
        err.println(field);
        err.println(field2);
        err.println(field3);
        field.setAccessible(true);
        Object object = field.get(t);
        field2.setAccessible(true);
        Object object2 = field2.get(t);
        field3.setAccessible(true);
        Object object3 = field3.get(t);
        err.println(object);
        err.println(object2);
        err.println(object3);
        err.println("-------------");
        Class clazzThreadLocalRandom = ThreadLocalRandom.class;
        err.println(clazzThreadLocalRandom);
        Field field4 = clazzThreadLocalRandom.getDeclaredField("SEED");
        Field field5 = clazzThreadLocalRandom.getDeclaredField("PROBE");
        Field field6 = clazzThreadLocalRandom.getDeclaredField("SECONDARY");
        err.println(field4);
        err.println(field5);
        err.println(field6);
        field4.setAccessible(true);
        Object object4 = field4.get(null);
        field5.setAccessible(true);
        Object object5 = field5.get(null);
        field6.setAccessible(true);
        Object object6 = field6.get(null);
        err.println(object4);
        err.println(object5);
        err.println(object6);
        err.println("-------------");
        Class clazzUnsafe = sun.misc.Unsafe.class;
        err.println(clazzUnsafe);
        Field field7 = clazzUnsafe.getDeclaredField("theUnsafe");
        err.println(field7);
        field7.setAccessible(true);
        Object object7 = field7.get(null);
        err.println(object7);
        sun.misc.Unsafe unsafe = (sun.misc.Unsafe) object7;
        err.println(unsafe);
        long offset = unsafe.objectFieldOffset(field);
        long offset2 = unsafe.objectFieldOffset(field2);
        long offset3 = unsafe.objectFieldOffset(field3);
        err.println(offset);
        err.println(offset2);
        err.println(offset3);
    }

}
