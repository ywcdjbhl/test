package com.you.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Optional
public class Test711 {
    public static void main(String[] args) {
        List list = new ArrayList();
        Optional op = Optional.of(list);
        System.err.println(op);
    }
}
