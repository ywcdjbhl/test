package com.you.test;

import java.util.LinkedList;

// 回收的比率比较高
public class Test531 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(new Test529());
        list.remove(0);
        System.gc();
    }
}
