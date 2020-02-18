package com.you.test;

import com.google.common.base.Preconditions;

// Guava.Preconditions
public class Test654 {
    public static void main(String[] args) {
        Preconditions.checkState(1 == 11, "eat[%s][%s][%s]", new Test654(), new Test654());
    }
}
