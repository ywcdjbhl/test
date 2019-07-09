package com.you.test;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class Test389 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Test389_2.class;
        BeanInfo beanInfo = Introspector.getBeanInfo(clazz);
        PropertyDescriptor[] ptors = beanInfo.getPropertyDescriptors();
        PrintStream err = System.err;
        for (PropertyDescriptor ptor : ptors) {
            String name = ptor.getName();
            Method method = ptor.getReadMethod();
            Method method2 = ptor.getReadMethod();
            Class<?> type = ptor.getPropertyType();
            err.println(name + "\n" + method + "\n" + method2 + "\n" + type);
            err.println("-------------");
        }
    }
}

class Test389_2 {
    private int age;
    private Integer score;
    private String add;
    public int getAge() {
        return 2;
    }

    public String getAdd() {
        return "";
    }

    public float getOld() {
        return 3.4F;
    }
}
