package com.you.test;

import java.util.HashSet;
import java.util.Set;

public class Test417 {
    public static void main (String[] args) {
        Set<Double> set = new HashSet<>();
        try {
            set.wait(-0, 999999);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
