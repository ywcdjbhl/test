package com.you.test;

import java.io.PrintStream;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/**
 * Test511的代码调整了位置
 * 一行一行得过
 */
public class Test512 {
    public static void main(String[] args) throws Exception {
        PrintStream err = System.err;
        Class clazzReferenceQueue = ReferenceQueue.class;
        err.println(clazzReferenceQueue + "_1");
        Field fieldNULL = clazzReferenceQueue.getDeclaredField("NULL");
        err.println(fieldNULL + "_2");
        fieldNULL.setAccessible(true);
        Object objectNULL = fieldNULL.get(null);
        err.println(objectNULL+ "_3");
        Field fieldENQUEUED = clazzReferenceQueue.getDeclaredField("ENQUEUED");
        err.println(fieldENQUEUED + "_4");
        fieldENQUEUED.setAccessible(true);
        Object objectENQUEUED = fieldENQUEUED.get(null);
        err.println(objectENQUEUED + "_5");
        err.println("-------");
        Class clazzReference = Reference.class;
        err.println(clazzReference + "_6");
        Field fieldqueue = clazzReference.getDeclaredField("queue");
        err.println(fieldqueue + "_7");
        fieldqueue.setAccessible(true);
        WeakReference wr = new WeakReference(new Test512_2());
        err.println(wr.get() + "_8");
        Object objectqueue = fieldqueue.get(wr);
        err.println(objectqueue + "_9");
        System.gc();
        err.println(wr.get() + "_10");
        Object objectqueue2 = fieldqueue.get(wr);
        err.println(objectqueue2 + "_11");
        err.println("-------");
        WeakReference wr2 = new WeakReference(new Test512_2(), null);
        err.println(wr2.get() + "_12");
        Object objectqueue3 = fieldqueue.get(wr2);
        err.println(objectqueue3 + "_13");
        System.gc();
        err.println(wr2.get() + "_14");
        Object objectqueue4 = fieldqueue.get(wr2);
        err.println(objectqueue4 + "_15");
        err.println("-------");
        ReferenceQueue queue = new ReferenceQueue();
        Test512_2 idVO = new Test512_2();
        WeakReference wr3 = new WeakReference(idVO, queue);
        err.println(wr3.get() + "_16");
        Object objectqueue5 = fieldqueue.get(wr3);
        err.println(objectqueue5 + "_17");
        System.gc();
        err.println(wr3.get() +"_18");
        Object objectqueue6 = fieldqueue.get(wr3);
        err.println(objectqueue6 + "_19");
        err.println(queue + "_20");
        err.println("-------");
        ReferenceQueue queue2 = new ReferenceQueue();
        WeakReference wr4 = new WeakReference(new Test512_2(), queue2);
        err.println(wr4.get() + "_21");
        Object objectqueue7 = fieldqueue.get(wr4);
        err.println(objectqueue7 + "_22");
        System.gc();
        err.println(wr4.get() +"_23");
        Object objectqueue8 = fieldqueue.get(wr4);
        err.println(objectqueue8 + "_24");
        err.println(queue2 + "_25");
    }
}

class Test512_2 {
    @Override
    protected void finalize() {
        System.err.println(this + "_26");
    }
}