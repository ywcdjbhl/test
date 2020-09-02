package com.you.test;

import java.util.Calendar;

public class Test773 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        System.err.println(hour);
    }
}
