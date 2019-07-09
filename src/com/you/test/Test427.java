package com.you.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test427 {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("1783-03-11 00:00:00");
        long time = date.getTime();
        System.err.println(time);
        date = sdf.parse("1970-1-1 08:00:00");
        time = date.getTime();
        System.err.println(time);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(0);
        date = calendar.getTime();
        System.err.println(date);
    }
}
