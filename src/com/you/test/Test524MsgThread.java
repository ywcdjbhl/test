package com.you.test;

import java.lang.reflect.Field;

public class Test524MsgThread extends Thread {

    public Test524MsgThread(Runnable r, String name) {
        super(r, name);
    }

    @Override
    public void run() {
        try {
            Class clazzThread = Thread.class;
            System.err.println(clazzThread);
            Thread t2 = Thread.currentThread();
            System.err.println(t2);
            Field fieldtarget = clazzThread.getDeclaredField("target");
            System.err.println(fieldtarget);
            fieldtarget.setAccessible(true);
            Object objecttarget = fieldtarget.get(this);
            System.err.println(objecttarget);
            if (objecttarget != null) {
                ((Thread) objecttarget).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
