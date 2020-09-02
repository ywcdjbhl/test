package com.you.test;

import java.util.TreeMap;

public class Test775 {
    public static void main(String[] args) {
        TreeMap<Integer, String> playWeightEnumTreeMap = new TreeMap<>();
        playWeightEnumTreeMap.put(100, "100");
        playWeightEnumTreeMap.put(200, "200");
        playWeightEnumTreeMap.put(300, "300");
        playWeightEnumTreeMap.put(400, "400");
        Integer key = playWeightEnumTreeMap.ceilingKey(0);
        System.err.println(key);
        Integer key2 = playWeightEnumTreeMap.ceilingKey(250);
        System.err.println(key2);
        Integer key3 = playWeightEnumTreeMap.ceilingKey(300);
        System.err.println(key3);

    }
}
