package com.you.test;

import com.google.common.collect.ArrayListMultimap;

// ArrayListMultimap
public class Test671 {
    public static void main(String[] args) {
        ArrayListMultimap map = ArrayListMultimap.<Double, Double>create();
        Double d = new Double(33);
        map.put(d, d);
        map.put(d, d);
        map.put(d, d);
        System.err.println(map);
        System.err.println(map.get(d));
    }
}
