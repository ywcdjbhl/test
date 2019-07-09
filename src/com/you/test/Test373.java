package com.you.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
// TODO 未完成
public class Test373 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add(null);
        list.remove(null);
        Iterator iter = list.iterator();
        for (int i = 0; i <= Integer.MAX_VALUE; i++) {
            list.add(0, null);
        }
        for (int i = 0; i <= Integer.MAX_VALUE; i++) {
            list.remove(null);
        }

    }

}
