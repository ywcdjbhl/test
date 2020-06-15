package com.you.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// ObjectOutputStream
public class Test758 {
    public static void main(String[] args) throws Exception {
        Test739 test = new Test739();
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("E://test.txt"));
        stream.writeObject(test);
    }
}
