package com.you.test;

import java.io.PrintStream;
import java.lang.reflect.Constructor;

public class Test160 {
	public static void main(String[] arge) throws Exception {
		PrintStream err = System.err;
		Class clazz = Test160_2.class;
		Constructor[] cs = clazz.getDeclaredConstructors();
		Constructor c = cs[0];
		c.setAccessible(true);
		Object obj = c.newInstance();
		err.println(obj);
	}
	
}
class Test160_2 {
	private Test160_2() {}
}