package com.you.test;

import java.lang.reflect.Constructor;

public class Test179 {
	 public static void main(String[] args) {
		 Class<?> clazz = Test179_2.class;
		 try {
			 Constructor cons = clazz.getDeclaredConstructor();	
			 cons.setAccessible(true);
			 Test179_2 test = (Test179_2) cons.newInstance();
			 System.out.println(test);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	 }
}
class Test179_2 {
	private Test179_2() {}
}