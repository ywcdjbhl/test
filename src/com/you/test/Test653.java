package com.you.test;

import com.google.common.base.Preconditions;

// Guava.Preconditions
public class Test653 {
    public static void main(String[] args) {
        Preconditions.checkState(1 == 11, "eat[%s][%s][%s]", new Test653(), new Test653(), new Test653());
    }
}
