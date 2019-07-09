package com.you.test;

import sun.reflect.Reflection;

public class Test383 {
    public static void main(String[] args) {
        Class<?> cl = Reflection.getCallerClass();
        System.err.println(cl);
    }
}
