package com.you.test;

import java.util.List;

// String.join
public class Test753 {
    public static void main(String[] args) {
        List<String> list = null;
        String s = String.join("qi", list);
        System.err.println(s);
    }
}
