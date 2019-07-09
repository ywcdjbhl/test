package com.you.test;
import java.io.PrintStream;
import java.lang.reflect.Field;
public class Test484 {
    public static void main(String[] args) throws Exception {
        PrintStream err = System.err;
        Class clazzUnsafe = sun.misc.Unsafe.class;
        err.println(clazzUnsafe);
        Field field7 = clazzUnsafe.getDeclaredField("theUnsafe");
        err.println(field7);
        field7.setAccessible(true);
        Object object7 = field7.get(null);
        err.println(object7);
        sun.misc.Unsafe unsafe = (sun.misc.Unsafe) object7;
        err.println(unsafe);
        Class clazzEn = Test484Vo.class;
        err.println(clazzEn);
        Field field = clazzEn.getDeclaredField("entrstdPyAcc");
        err.println(field);
        Test484Vo py = new Test484Vo();
        field.setAccessible(true);
        Object object = field.get(py);
        err.println(object);
        long offset = unsafe.objectFieldOffset(field);
        err.println(offset);
        Object object3 = unsafe.getObject(py, offset);
        err.println(object3);
        unsafe.putObject(py, offset, "zhongxin");
        Object object2 = field.get(py);
        err.println(object2);
    }

}

class Test484Vo {
    private String entrstdPyAcc = "shanghai";
}
