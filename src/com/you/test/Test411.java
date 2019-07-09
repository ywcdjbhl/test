package com.you.test;

import java.util.HashSet;
import java.util.Set;

public class Test411 {
    public static void main (String[] args) {
        Set<Double> set = new HashSet<>();
        try {
            set.wait(100, 3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
