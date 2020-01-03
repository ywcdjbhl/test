package com.you.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test608 {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        System.err.println(set);
        boolean flag = set instanceof HashSet;
        System.err.println(flag);
    }
}
