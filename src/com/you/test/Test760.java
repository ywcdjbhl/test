package com.you.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// ObjectOutputStream
public class Test760 {
    public static void main(String[] args) throws Exception {
        Test734 test = new Test734();
        test.age = 198;
        test.name = "paul";
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("E://test.txt"));
        stream.writeObject(test);
    }
}
