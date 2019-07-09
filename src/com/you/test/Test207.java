package com.you.test;
import java.lang.reflect.Constructor;
import java.sql.DriverManager;
public class Test207 {
	public static void main(String[] args) {
		try {
			Class clazz = DriverManager.class;
			Constructor[] cons = clazz.getDeclaredConstructors();	
			for (Constructor con : cons) {
				System.out.println(con);	
				con.setAccessible(true);
				Object obj = con.newInstance();
				System.out.println(obj);
				obj = con.newInstance();
				System.out.println(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
