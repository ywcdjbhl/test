package com.you.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test685 {
    public static void main(String[] args) throws Exception {
        long seconds = 0;
        Date date = new Date();
        date.setTime(seconds);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = sdf.format(date);
        System.err.println(str);


        String ten = "2020-04-10 10:00:00";
        Date tenDate = sdf.parse(ten);
        long tenSeconds = tenDate.getTime();
        long daysten = ((tenSeconds / 1000) + 28800)/ 86400;
        System.err.println(daysten);

        String six = "2020-04-10 06:00:00";
        Date sixDate = sdf.parse(six);
        long sixSeconds = sixDate.getTime();
        long dayssix = ((sixSeconds / 1000) + 28800)/ 86400;
        System.err.println(dayssix);

        String one = "2020-04-10 01:00:00";
        Date oneDate = sdf.parse(one);
        long oneSeconds = oneDate.getTime();
        long daysone = ((oneSeconds / 1000) + 28800)/ 86400;
        System.err.println(daysone);

        String twentyThree = "2020-04-10 23:00:00";
        Date twentyThreeDate = sdf.parse(twentyThree);
        long twentyThreeSeconds = twentyThreeDate.getTime();
        long daystwentyThree = ((twentyThreeSeconds / 1000) + 28800)/ 86400;
        System.err.println(daystwentyThree);
    }
}
