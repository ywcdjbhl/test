package com.you.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Test677 {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put("eat", "drink");
        Collections.newSetFromMap(map);
    }
}
