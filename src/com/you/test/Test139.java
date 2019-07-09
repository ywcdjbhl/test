package com.you.test;

public class Test139 {
	private Test139 test = new Test139();
	public Test139 () {
		System.out.println("TEST139构造方法");
	}
	public static void main(String[] args) {
//		Test139 test = new Test139();
		try {
			Class clazz = Class.forName("java.lang.Boolean");	
			clazz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
