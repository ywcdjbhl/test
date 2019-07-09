package com.you.test;

public class Test341 {
    public static void main(String[] args) {
        String s1 = "Hollis";
        String s2 = new String("Hollis");
        String s3 = new String("Hollis").intern();
        System.err.println(s1 == s2);
        System.err.println(s1 == s3);

    }
}
