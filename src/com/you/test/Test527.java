package com.you.test;

import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;

public class Test527 {
    public static void main(String[] args) throws Exception {
        PrintStream err = System.err;
        Class clazzLinkedList = LinkedList.class;
        err.println(clazzLinkedList);
        Field fieldlast = clazzLinkedList.getDeclaredField("last");
        err.println(fieldlast);
        fieldlast.setAccessible(true);
        LinkedList list = new LinkedList();
        list.add(2);
        list.add("word");
        list.add(new TreeMap());
        list.add(new HashSet(4));
        Object objectlast = fieldlast.get(list);
        err.println(objectlast);
        Object objectclone = list.clone();
        err.println(objectclone);
        LinkedList list2 = (LinkedList) objectclone;
        err.println((list == list2));
        Object objectlast2 = fieldlast.get(list2);
        err.println(objectlast2);
        err.println((objectlast == objectlast2));
        err.println("--------");
        err.println((list.size() == list2.size()));
        for (int i = 0; i < list.size(); i++) {
            err.println((list.get(i) == list2.get(i)));
        }
    }
}
