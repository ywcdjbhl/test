package com.you.test;
import java.lang.reflect.Method;
import java.io.PrintStream;
public class Test193 {
	public static void main(String[] args) {
		Class<?> clazz = Test193_2.class;	
		try {
			Method method = clazz.getDeclaredMethod("run");	
			PrintStream err = System.err;
			method.setAccessible(true);
			int mod = method.getModifiers();
			err.println(mod);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class Test193_2 {
	private void run() {
		System.out.println("private run()");
	}
}
