package com.you.test;

import java.util.StringJoiner;

// StringJoiner
public class Test757 {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner("-", "(", ")");
        joiner.add("qi");
        System.err.println(joiner);
        joiner.add("bin");
        System.err.println(joiner);

    }
}
