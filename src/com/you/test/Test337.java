package com.you.test;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Test337 {
    public static void main(String[] args) {
        ArrayDeque<String> ad = new ArrayDeque();
        ad.add("jack");
        ad.add("lily");
        ad.add("jones");
        Iterator it = ad.iterator();
        ad.addFirst("tom");
        it.next();
        ad = new ArrayDeque();
        ad.add("jack");
        ad.add("lily");
        ad.add("jones");
        it = ad.iterator();
        ad.addLast("tom");
        it.next();
    }
}
