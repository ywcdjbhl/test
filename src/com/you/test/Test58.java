package com.you.test;

import java.util.Calendar;
import java.util.Date;
public class Test58 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.DATE, 30);
		Date date = calendar.getTime();
		System.out.println(date);
	}
}
