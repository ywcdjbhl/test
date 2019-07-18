package com.you.test;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.concurrent.LinkedBlockingQueue;

public class Test525 {
    public static void main(String[] args) throws Exception {
        PrintStream err = System.err;
        Class clazzLinkedBlockingQueue = LinkedBlockingQueue.class;
        err.println(clazzLinkedBlockingQueue);
        Field fieldcapacity = clazzLinkedBlockingQueue.getDeclaredField("capacity");
        err.println(fieldcapacity);
        fieldcapacity.setAccessible(true);
        LinkedBlockingQueue queue = new LinkedBlockingQueue();
        Object objectcapacity = fieldcapacity.get(queue);
        err.println(objectcapacity);
        Field fieldcount = clazzLinkedBlockingQueue.getDeclaredField("count");
        err.println(fieldcount);
        fieldcount.setAccessible(true);
        Object objectcount = fieldcount.get(queue);
        err.println(objectcount);
        err.println("------------");
        LinkedBlockingQueue queue2 = new LinkedBlockingQueue(1);
        Object objectcapacity2 = fieldcapacity.get(queue2);
        err.println(objectcapacity2);
        Object objectcount2 = fieldcount.get(queue2);
        err.println(objectcount2);
        err.println("------------");
        LinkedBlockingQueue queue3 = new LinkedBlockingQueue(3);
        Object objectcapacity3 = fieldcapacity.get(queue3);
        err.println(objectcapacity3);
        Object objectcount3 = fieldcount.get(queue3);
        err.println(objectcount3);
    }
}
