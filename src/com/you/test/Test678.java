package com.you.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Test678 {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put("eat", "drink");
        map.remove("eat");
        Collections.newSetFromMap(map);
    }
}
