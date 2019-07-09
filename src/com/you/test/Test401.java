package com.you.test;

import java.util.HashSet;
import java.util.Set;

public class Test401 {
    public static void main(String[] args) {
        Set<Double> set = new HashSet<>();
        try {
            set.wait();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
