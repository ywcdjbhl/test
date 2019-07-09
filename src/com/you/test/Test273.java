package com.you.test;

import java.lang.reflect.Array;

public class Test273 {
	public static void main(String[] args) {
		Class clazz = Test273.class;
		Object obj = Array.newInstance(clazz, 8);
		Object[] objs = (Object[])obj;
		System.err.println(objs);
		
	}
}
