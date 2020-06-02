package com.you.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
// transient
public class Test735 {
    public static void main(String[] args) throws Exception {
        Test734 test = new Test734();
        test.age = 78;
        test.height = 190D;
        test.name = "curry";
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("E://test.txt"));
        stream.writeObject(test);
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("E://test.txt"));
        Object object = in.readObject();
        System.err.println(object);
        Test734 test2 = (Test734) object;
        System.err.println(test2);

    }
}
