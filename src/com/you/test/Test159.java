package com.you.test;

public class Test159 {
	
	public static void main(String[] args) {
		Class clazz = Test159_2.class;
		try {
			Object obj = clazz.newInstance();	
			Test159_2 test = (Test159_2)obj;
			System.out.println(test);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
class Test159_2 {
	private Test159_2() {}
}
