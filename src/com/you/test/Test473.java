package com.you.test;

import java.util.HashMap;
import java.util.Map;

public class Test473 {
    public static void main(String[] args) {
        Map map = new HashMap();
        System.err.println(map.containsKey("hel"));
        map.put("hel", null);
        System.err.println(map.containsKey("hel"));
        map.remove("hel");
        System.err.println(map.containsKey("hel"));
    }
}
