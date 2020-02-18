package com.you.test;

import com.google.common.base.Preconditions;

// Guava.Preconditions
public class Test655 {
    public static void main(String[] args) {
        Preconditions.checkState(1 == 11, "eat[%s][%s]", new Test655(), new Test655(), new Test655());
    }
}
