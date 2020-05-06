package com.you.test;

import java.util.HashMap;
import java.util.Map;

public class Test725 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(map, map);
        System.err.println(map);
    }
}
