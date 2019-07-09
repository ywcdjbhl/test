package com.you.test;

public class Test117 {
	public static void main(String[] args) {
		Class clazz = Test117.class;
		try {
			clazz.getMethod("copy", String.class, Test11.class);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
}
