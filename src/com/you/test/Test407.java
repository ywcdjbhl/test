package com.you.test;

import java.util.HashSet;
import java.util.Set;

public class Test407 {
    public static void main(String[] args) {
        Set<Double> set = new HashSet<>();
        synchronized (set) {
            try {
                System.err.println("get monitor");
                set.wait(5000);
                System.err.println("release monitor");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
