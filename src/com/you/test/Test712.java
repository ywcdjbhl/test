package com.you.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Optional
public class Test712 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(33);
        Optional op = Optional.of(list);
        System.err.println(op);
    }
}
