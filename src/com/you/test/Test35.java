package com.you.test;
import java.io.PrintStream;
import java.util.Calendar;
import java.util.Date;
public class Test35 {
	public static void main(String[] args){
		PrintStream err=System.err;
		Calendar calendar=Calendar.getInstance();
		Date date=calendar.getTime();
		err.println(date);
		calendar.add(Calendar.DATE,-7);
		date=calendar.getTime();
		err.println(date);
	}
}
