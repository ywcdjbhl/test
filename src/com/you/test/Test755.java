package com.you.test;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

// StringJoiner
public class Test755 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("qi");
        list.add("bin");
        list.add("hui");
        StringJoiner joiner = new StringJoiner("-", "(", ")");
        System.err.println(joiner);
    }
}
