package com.you.test;

import java.util.HashSet;
import java.util.Set;

public class Test418 {
    public static void main (String[] args) {
        Set<Double> set = new HashSet<>();
        try {
            set.wait(0, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
