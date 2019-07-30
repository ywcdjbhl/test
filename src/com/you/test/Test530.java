package com.you.test;

import java.util.ArrayList;
// 应该不会回收
public class Test530 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Test529());
        Object cone = list.clone();
        list.remove(0);
        System.gc();
    }
}
