package com.you.test;

import java.io.PrintStream;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/**
 * 一行一行得过
 */
public class Test511 {
    public static void main(String[] args) throws Exception {
        PrintStream err = System.err;
        Class clazzReferenceQueue = ReferenceQueue.class;
        err.println(clazzReferenceQueue + "_1");
        Field fieldNULL = clazzReferenceQueue.getDeclaredField("NULL");
        err.println(fieldNULL + "_2");
        fieldNULL.setAccessible(true);
        Object objectNULL = fieldNULL.get(null);
        err.println(objectNULL + "_3");
        Field fieldENQUEUED = clazzReferenceQueue.getDeclaredField("ENQUEUED");
        err.println(fieldENQUEUED + "_4");
        fieldENQUEUED.setAccessible(true);
        Object objectENQUEUED = fieldENQUEUED.get(null);
        err.println(objectENQUEUED + "_5");
        err.println("-------");
        WeakReference wr = new WeakReference(new Test511_2());
        err.println(wr.get() + "_6");
        System.gc();
        err.println(wr.get() + "_7");
        Class clazzReference = Reference.class;
        err.println(clazzReference + "_8");
        Field fieldqueue = clazzReference.getDeclaredField("queue");
        err.println(fieldqueue + "_9");
        fieldqueue.setAccessible(true);
        Object objectqueue = fieldqueue.get(wr);
        err.println(objectqueue + "_10");
        err.println("-------");
        WeakReference wr2 = new WeakReference(new Test511_2(), null);
        err.println(wr2.get() + "_11");
        System.gc();
        err.println(wr2.get() + "_12");
        Object objectqueue2 = fieldqueue.get(wr2);
        err.println(objectqueue2 + "_13");
        err.println("-------");
        ReferenceQueue queue = new ReferenceQueue();
        Test511_2 idVO = new Test511_2();
        WeakReference wr3 = new WeakReference(idVO, queue);
        err.println(wr3.get() + "_14");
        System.gc();
        err.println(wr3.get() + "_15");
        Object objectqueue3 = fieldqueue.get(wr3);
        err.println(objectqueue3 + "_16");
        err.println(queue + "_17");
        err.println("-------");
        ReferenceQueue queue2 = new ReferenceQueue();
        WeakReference wr4 = new WeakReference(new Test511_2(), queue2);
        err.println(wr4.get() + "_18");
        System.gc();
        err.println(wr4.get() + "_19");
        Object objectqueue4 = fieldqueue.get(wr4);
        err.println(objectqueue4 + "_20");
        err.println(queue2 + "_21");
    }
}

class Test511_2 {
    @Override
    protected void finalize() {
        System.err.println(this + "_22");
    }
}