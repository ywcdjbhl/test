package com.you.test;

import java.util.HashMap;
import java.util.Map;

public class Test724 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(334, map);
        System.err.println(map);
    }
}
