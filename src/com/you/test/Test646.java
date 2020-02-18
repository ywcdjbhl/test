package com.you.test;

import com.google.common.base.Preconditions;

// Guava.Preconditions
public class Test646 {
    public static void main(String[] args) {
        Preconditions.checkState(1 == 11, "eat", new Test646(), new Test646());
    }
}
