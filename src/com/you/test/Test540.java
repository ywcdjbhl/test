package com.you.test;

public class Test540 implements Test540_2, Test540_3 {
    public static void main(String[] args) {
        Class clazzTest540 = Test540.class;
        System.err.println(clazzTest540);
        Class<?>[] clazzInterfaceArray = clazzTest540.getInterfaces();
        for (Class clazzInter : clazzInterfaceArray) {
            System.err.println(clazzInter);
        }
        ClassLoader clr = clazzTest540.getClassLoader();
        System.err.println(clr);
    }
}

interface Test540_2 {

}

interface Test540_3 {

}