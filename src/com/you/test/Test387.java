package com.you.test;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Test387 {
    public static void main(String[] args) {
        Object obj = new ArrayList();
        List list = (List) obj;
        System.err.println(obj == list);
        AbstractList al = (AbstractList) list;
        System.err.println(al == list);
        System.err.println(al == obj);
        ArrayList alt = (ArrayList) al;
        System.err.println(alt == al);
        System.err.println(alt == obj);


    }
}
