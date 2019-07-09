package com.you.test;

import java.util.WeakHashMap;

public class Test506 {
    public static void main(String[] args) {
        WeakHashMap<Test506_2, Test506_3> map = new WeakHashMap<>();
        map.put(new Test506_2(), new Test506_3());
        map.put(new Test506_2(), new Test506_3());
        map.put(new Test506_2(), new Test506_3());
        System.err.println(map);
        System.gc();
        System.err.println(map);
    }
}

class Test506_2 {

}

class Test506_3 {

}