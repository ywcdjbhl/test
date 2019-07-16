package com.you.test;

public class Test524 {
    public static void main(String[] args) {
        Test524LawThread lt = new Test524LawThread("lawthread");
        Test524MsgThread mt = new Test524MsgThread(lt, "msgthread");
        mt.run();
    }
}
