package com.you.test;

import java.util.WeakHashMap;

public class Test507 {
    public static void main(String[] args) {
        WeakHashMap<Test507_2, Test507_3> map = new WeakHashMap<>();
        map.put(new Test507_2(), new Test507_3());
        map.put(new Test507_2(), new Test507_3());
        Test507_2 test = new Test507_2();
        Test507_3 test2 = new Test507_3();
        System.err.println(test);
        map.put(test, test2);
        Test507_2 test3 = new Test507_2();
        Test507_3 test4 = new Test507_3();
        System.err.println(test3);
        map.put(test3, test4);
        map.put(new Test507_2(), new Test507_3());
        map.put(new Test507_2(), new Test507_3());
        System.err.println(map);
        System.gc();
        System.err.println(map);
    }
}

class Test507_2 {

}

class Test507_3 {

}
