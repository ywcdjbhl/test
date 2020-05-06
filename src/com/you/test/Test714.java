package com.you.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

// Optional
public class Test714 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(3, 55);
        Optional op = Optional.of(map);
        System.err.println(op);
    }
}
