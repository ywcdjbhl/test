package com.you.test;

import java.util.HashSet;
import java.util.Set;

public class Test415 {
    public static void main (String[] args) {
        Set<Double> set = new HashSet<>();
        try {
            set.wait(800, 1000000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
