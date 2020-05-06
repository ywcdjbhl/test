package com.you.test;

import java.util.HashMap;
import java.util.Map;

public class Test723 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(map, 3334);
        System.err.println(map);
    }
}
