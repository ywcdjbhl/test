package com.you.test;

import java.util.LinkedList;

public class Test342 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(list);
        list.add(null);
        System.err.println(list);
    }
}
