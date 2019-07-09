package com.you.test;

import java.util.HashSet;
import java.util.Set;

public class Test448 {
    public static void main(String[] args) {
        Set<Double> set = new HashSet<>();
        synchronized (set) {
            set.notifyAll();
        }
    }
}
