package com.you.test;

import java.util.HashSet;
import java.util.Set;

public class Test454 {
    public static void main(String[] args) {
        Set<Double> set = new HashSet<>();
        try {
            set.add(1D);
            float i = 1 / 0;
            set.add(2D);
        } finally {
            set.add(3D);
        }
        System.err.println(set);

    }
}
