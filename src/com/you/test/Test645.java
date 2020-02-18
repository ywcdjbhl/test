package com.you.test;

import com.google.common.base.Preconditions;

// Guava.Preconditions
public class Test645 {
    public static void main(String[] args) {
        Preconditions.checkState(1 == 1, "eat", new Test645(), new Test645());
    }
}
