package com.you.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// Collections.unmodifiableList
public class Test591 {
    public static void main(String[] args) {
        List list = new ArrayList();
        List list2 = Collections.unmodifiableList(list);
        System.err.println(list2.getClass());
        list = new LinkedList();
        list2 = Collections.unmodifiableList(list);
        System.err.println(list2.getClass());
    }
}
