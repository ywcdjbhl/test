package com.you.test;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.io.PrintStream;
public class Test502 {
    public static void main(String[] args) throws Exception {
        PrintStream err = System.err;
        Class clazzStriped = Striped644.class;
        err.println(clazzStriped);
        Field fieldcellsBusy = clazzStriped.getDeclaredField("cellsBusy");
        err.println(fieldcellsBusy);
        Striped644 striped = new Striped644();
        Object objectcellsBusy = fieldcellsBusy.get(striped);
        err.println(objectcellsBusy.getClass());
        err.println(objectcellsBusy);
        err.println("------------");
        Field fieldCELLSBUSY = clazzStriped.getDeclaredField("CELLSBUSY");
        fieldCELLSBUSY.setAccessible(true);
        err.println(fieldCELLSBUSY);
        Object objectCELLSBUSY = fieldCELLSBUSY.get(null);
        err.println(objectCELLSBUSY.getClass());
        err.println(objectCELLSBUSY);
        err.println("------------");
        Class clazzUnsafe = sun.misc.Unsafe.class;
        err.println(clazzUnsafe);
        Field fieldtheUnsafe = clazzUnsafe.getDeclaredField("theUnsafe");
        err.println(fieldtheUnsafe);
        fieldtheUnsafe.setAccessible(true);
        Object objecttheUnsafe = fieldtheUnsafe.get(null);
        err.println(objecttheUnsafe);
        sun.misc.Unsafe unsafe = (sun.misc.Unsafe) objecttheUnsafe;
        err.println(unsafe);
        long offset = unsafe.objectFieldOffset(fieldcellsBusy);
        err.println(offset);
        err.println("------------");
        Method methodobjectFieldOffset = clazzUnsafe.getMethod("objectFieldOffset", Field.class);
        err.println(methodobjectFieldOffset);
        Object offset2 = methodobjectFieldOffset.invoke(unsafe, fieldcellsBusy);
        err.println(offset2.getClass());
        err.println(offset2);
    }
}
