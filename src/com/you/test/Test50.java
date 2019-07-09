package com.you.test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Test50 {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = sdf.parse("2017-2-31");	
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
