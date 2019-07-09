package com.you.test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.io.PrintStream;
public class Test206 {
	public static void main(String[] args) {
		try {
			Class<?> clazz = Test206_2.class;
			Method[] methods = clazz.getDeclaredMethods();	
			PrintStream err = System.err;
			for (Method method : methods) {
				err.println(method);
			}
			err.println("--------------");
			Constructor[] cons = clazz.getConstructors();
			for (Constructor con : cons) {
				err.println(con);
			}
			err.println("--------------");
			cons = clazz.getDeclaredConstructors();
			for (Constructor con : cons) {
				err.println(con);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class Test206_2 {
	public Test206_2 () {
		
	}
	Test206_2 (String str) {
		
	}
	private Test206_2 (float fl) {
		
	}
	protected Test206_2 (float fl, char ch) {
		
	}
	public void eat() {}
	private void drink() {}
	protected void run() {}
	void lay() {}
}

