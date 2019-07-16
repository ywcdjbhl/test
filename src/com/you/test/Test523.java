package com.you.test;

public class Test523 {
    public static void main(String[] args) {
        Test523LawThread lt = new Test523LawThread("lawthread");
        Test523MsgThread mt = new Test523MsgThread(lt, "msgthread");
        mt.start();
    }
}
