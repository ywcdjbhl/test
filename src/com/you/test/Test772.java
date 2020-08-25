package com.you.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test772 {
    public static void main(String[] args) {
        Date date = new Date(1597723200000L);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(date);
        System.err.println(s);
        Date date2 = new Date(1598112001000L);
        String s2 = sdf.format(date2);
        System.err.println(s2);
    }
}
