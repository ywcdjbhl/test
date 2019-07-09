package com.you.test;

import java.util.HashSet;
import java.util.Set;

public class Test433 {
    public static void main(String[] args) {
        Set<Double> set = new HashSet<>();
        synchronized (set) {
            try {
                set.wait(800, 1000000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
