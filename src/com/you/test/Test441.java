package com.you.test;

import java.util.HashSet;
import java.util.Set;

public class Test441 {
    public static void main(String[] args) {
        Set<Double> set = new HashSet<>();
        synchronized (set) {
            try {
                set.wait(-200, 999999);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
