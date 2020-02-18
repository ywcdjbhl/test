package com.you.test;

import com.google.common.base.Preconditions;

// Guava.Preconditions
public class Test652 {
    public static void main(String[] args) {
        Preconditions.checkState(1 == 11, "eat", null);
    }
}
