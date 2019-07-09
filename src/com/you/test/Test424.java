package com.you.test;

import java.util.HashSet;
import java.util.Set;

public class Test424 {
    public static void main (String[] args) {
        Set<Double> set = new HashSet<>();
        try {
            set.wait(0, 1000000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
