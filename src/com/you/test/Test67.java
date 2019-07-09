package com.you.test;
import java.io.PrintStream;
import java.util.Date;
public class Test67 {
	public static void main(String[] args) {
		Date date = new Date();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Date date2 = new Date();
		boolean flag = date.before(date);
		PrintStream err = System.err;
		err.println(flag);
	}
}
