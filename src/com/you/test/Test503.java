package com.you.test;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.io.PrintStream;
public class Test503 {
    public static void main(String[] args) throws Exception {
        PrintStream err = System.err;
        Class clazzRuntime = Runtime.class;
        err.println(clazzRuntime);
        Field fieldcurrentRuntime = clazzRuntime.getDeclaredField("currentRuntime");
        err.println(fieldcurrentRuntime);
        fieldcurrentRuntime.setAccessible(true);
        Object objectcurrentRuntime = fieldcurrentRuntime.get(null);
        err.println(objectcurrentRuntime);
        Runtime runtime = (Runtime) objectcurrentRuntime;
        err.println(runtime);
        err.println(runtime.getRuntime());
        err.println("-----------");
        Method methodgetRuntime = clazzRuntime.getMethod("getRuntime");
        err.println(methodgetRuntime);
        Object objectruntime = methodgetRuntime.invoke(null);
        err.println(objectruntime);

    }
}
