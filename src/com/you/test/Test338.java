package com.you.test;
import java.lang.reflect.Method;
import java.io.PrintStream;
public class Test338 {
    public static void main(String[] args) throws Exception {
        Class clazz = Test338_2.class;
        Method method = clazz.getDeclaredMethod("eat");
        int modi = method.getModifiers();
        PrintStream err = System.err;
        err.println(modi);
        Class clazz2 = method.getReturnType();
        err.println(clazz2.getName());
        err.println(clazz2);
    }
}

class Test338_2 {
    double eat() {
        return 3.3D;
    }
}
