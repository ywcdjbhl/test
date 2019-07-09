package com.you.test;

import java.util.LinkedList;
import java.util.List;

public class Test374 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(78);
        for (Integer i : list) {
            System.err.println(i);
        }

        Integer[] is = new Integer[4];
        for (Integer i : is) {
            System.err.println(i);
        }
    }
}
