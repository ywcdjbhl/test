package com.you.test;

import com.google.common.base.Preconditions;

// Guava.Preconditions
public class Test651 {
    public static void main(String[] args) {
        Preconditions.checkState(1 == 11, null, new Test651(), new Test651(), new Test651());
    }
}
