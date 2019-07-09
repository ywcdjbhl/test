package com.you.test;

import java.lang.reflect.Constructor;

public class Test236 {
	public static void main(String[] args) {
		Class<?> clazz = Test236_2.class;
		try {
			Constructor<?> con = clazz.getDeclaredConstructor();			
			con.setAccessible(false);
			con.newInstance();
			Class clazz2 = Class.class;
			con = clazz2.getDeclaredConstructor();
			con.setAccessible(true);
			con.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

class Test236_2 {
	
}
