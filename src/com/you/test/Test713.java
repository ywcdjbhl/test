package com.you.test;

import java.util.*;

// Optional
public class Test713 {
    public static void main(String[] args) {
        Map map = new HashMap();
        Optional op = Optional.of(map);
        System.err.println(op);
    }
}
