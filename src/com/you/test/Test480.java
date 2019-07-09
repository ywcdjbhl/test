package com.you.test;

public class Test480 {
    public static void main(String[] args) {
        Double[] ds = new Double[2];
        System.err.println(ds instanceof Double[]);
        System.err.println(ds instanceof Object[]);
        System.err.println(ds.getClass() == Double[].class);
    }
}
