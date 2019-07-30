package com.you.test;

import java.util.LinkedList;
// 应该不会回收
public class Test532 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(new Test529());
        Object cone = list.clone();
        list.remove(0);
        System.gc();
    }
}
