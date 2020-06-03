package com.you.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test741 {
    public static void main(String[] args) throws Exception {
        new ObjectOutputStream(new FileOutputStream("E://test.txt"));
    }
}
