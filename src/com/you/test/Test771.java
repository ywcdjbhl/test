package com.you.test;

import java.util.HashMap;
import java.util.Map;

public class Test771 {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        Object obj = null;
        map.put("roomid", obj);
        boolean flag = map.containsKey("roomid");
        System.err.println(flag);
        System.err.println(map.get("roomid"));
    }
}
