package com.you.test;

public class Test392 {
    public void test() throws Exception {
        try {
            int i = 2;
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public static void main(String[] args) {
        Test392 test = new Test392();
//        test.test();
    }


}
