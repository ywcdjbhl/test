package com.you.test;

import java.util.HashSet;
import java.util.Set;

public class Test413 {
    public static void main (String[] args) {
        Set<Double> set = new HashSet<>();
        try {
            set.wait(200, -300);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
