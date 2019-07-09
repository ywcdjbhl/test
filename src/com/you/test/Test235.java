package com.you.test;

import java.io.PrintStream;

public class Test235 {
	public static void main(String[] args) {
		Class<?> clazz = Class.class;
		PrintStream err = System.err;
		err.println(clazz);
		Class<?> clazz2 = clazz.getClass();
		err.println(clazz2 == clazz);
		try {
			clazz2.newInstance();	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
