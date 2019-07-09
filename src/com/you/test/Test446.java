package com.you.test;

import java.util.HashSet;
import java.util.Set;

public class Test446 {
    public static void main(String[] args) {
        Set<Double> set = new HashSet<>();
        synchronized (set) {
            set.notify();
        }
    }
}
