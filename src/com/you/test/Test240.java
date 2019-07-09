package com.you.test;

public class Test240 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz = String[].class;
		System.out.println(clazz);
		Class.forName("[Ljava.lang.String;");
		Class.forName("[Ljava.lang.Double;");
	}
}
