package com.you.test;

import java.util.ArrayList;
// 回收的比率比较高
public class Test528 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Test529());
        list.remove(0);

        System.gc();
    }
}
