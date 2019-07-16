package com.you.test;

import java.lang.reflect.Field;

public class Test523MsgThread extends Thread {

    public Test523MsgThread(Runnable r, String name) {
        super(r, name);
    }

    @Override
    public void run() {
        try {
            Thread t = Thread.currentThread();
            System.err.println(t);
            Class clazzThread = Thread.class;
            System.err.println(clazzThread);
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
