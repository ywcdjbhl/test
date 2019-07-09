package com.you.test;
import java.lang.reflect.Method;
public class Test471 {
    public static void main(String[] args) throws Exception {
        Class clazz = Test471_2.class;
        System.err.println("--------");
        Method method = clazz.getMethod("drink");
        System.err.println("--------");
        method.invoke(98L);
        method.invoke(null);
        method.invoke("");
        method.invoke("   ");
        method.invoke("osox");


    }
}

class Test471_2 {
    static {
        System.err.println("static");
    }

    public static Long food = eat();

    public static Long eat() {
        System.err.println("eat");
        return 4L;
    }
    public static void drink() {
        System.err.println("drink");
    }
}
