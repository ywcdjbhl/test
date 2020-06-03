package com.you.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
// debug
public class Test742 {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("E://test.txt"));
        Test734 test = new Test734();
        stream.writeObject(test);
    }
}
