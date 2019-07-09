package com.you.test;
import java.io.PrintStream;
import java.util.Date;

public class Test20 {
	public static void main(String[] args){
		String startDate="2017-08-12";
		String endDate="2017-08-16";
		Date day=DateUtil.parseStringToDate2(startDate);
		Date day2=DateUtil.parseStringToDate2(endDate);
		PrintStream err=System.err;
		long l=day.getTime();
		long l2=day2.getTime();
		err.println(l+"\n"+l2);
		long mid=(l2-l)/(1000*60*60*24);
		err.println(mid);
	}
}
