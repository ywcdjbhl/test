package com.you.test;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class Test485 {
    public static void main(String[] args) throws Exception {
        PrintStream err = System.err;
        Class striped64Clazz = Class.forName("java.util.concurrent.atomic.Striped64");
        err.println(striped64Clazz);
        Method getProbeMethod = striped64Clazz.getDeclaredMethod("getProbe");
        err.println(getProbeMethod);
        getProbeMethod.setAccessible(true);
        Object getProbeObject = getProbeMethod.invoke(null);
        err.println(getProbeObject.getClass());
        err.println(getProbeObject);
        err.println("-------------");
        Class unsafeClazz = sun.misc.Unsafe.class;
        err.println(unsafeClazz);
        Field unsafeField = unsafeClazz.getDeclaredField("theUnsafe");
        err.println(unsafeField);
        unsafeField.setAccessible(true);
        Object unsafeObject = unsafeField.get(null);
        err.println(unsafeObject);
        sun.misc.Unsafe unsafe = (sun.misc.Unsafe) unsafeObject;
        err.println(unsafe);
        err.println("-------------");
        Class threadClazz = Thread.class;
        err.println(threadClazz);
        Field threadLocalRandomProbeField = threadClazz.getDeclaredField("threadLocalRandomProbe");
        err.println(threadLocalRandomProbeField);
        Thread t = Thread.currentThread();
        threadLocalRandomProbeField.setAccessible(true);
        Object threadLocalRandomProbeObject = threadLocalRandomProbeField.get(t);
        err.println(threadLocalRandomProbeObject);
        err.println("-------------");
        Field probeField = striped64Clazz.getDeclaredField("PROBE");
        err.println(probeField);
        probeField.setAccessible(true);
        Object probeObject = probeField.get("");
        err.println(probeObject.getClass());
        err.println(probeObject);
        err.println("-------------");
        long threadLocalRandomProbeOffset = unsafe.objectFieldOffset(threadLocalRandomProbeField);
        err.println(threadLocalRandomProbeOffset);
    }
}
