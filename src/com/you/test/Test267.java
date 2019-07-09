package com.you.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test267 {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = "0000-00-00 00:00:0";
		sdf.parse(str);
	}
}
