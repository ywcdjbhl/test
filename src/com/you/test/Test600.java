package com.you.test;

public class Test600 {
    public static void main(String[] args) {
        Throwable th = new Throwable();
        String mess = th.getMessage();
        System.err.println(mess);
        String mess2 = th.getLocalizedMessage();
        System.err.println(mess2);
        String mess3 = th.toString();
        System.err.println(mess3);
        Throwable th2 = new Throwable("orange");
        String mess4 = th2.getMessage();
        System.err.println(mess4);
        String mess5 = th2.getLocalizedMessage();
        System.err.println(mess5);
        String mess6 = th2.toString();
        System.err.println(mess6);
        Throwable th3 = new Throwable("null");
        String mess7 = th3.getMessage();
        System.err.println(mess7);
        String mess8 = th3.getLocalizedMessage();
        System.err.println(mess8);
        String mess9 = th3.toString();
        System.err.println(mess9);
    }
}
