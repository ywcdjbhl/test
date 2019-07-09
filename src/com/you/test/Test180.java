package com.you.test;

import java.io.PrintStream;
import java.lang.reflect.Method;

public class Test180 {
	public static void main(String[] args) {
		Class<?> clazz = Test180_2.class;
		try {
			Method method = clazz.getMethod("run", Test180_2.class, String.class, char.class);
			method.invoke(clazz.newInstance(), new Test180_2(), "dd",' ');
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}

class Test180_2 {
	PrintStream err = System.err;
	public void run() {
		err.println("无参数的run()方法");
	}
	public void run(Test180_2 test) {
		err.println("参数为:Test180_2的run()方法");
	}
	public void run(Test180_2 test, Test180_2 test2) {
		err.println("参数为:Test180_2, Test180_2的run()方法");
	}
	public void run(Test180_2 test, Test180_2 test2, String str) {
		err.println("参数为:Test180_2, Test180_2, String的run()方法");
	}
	public void run(Test180_2 test,  String str, Test180_2 test2) {
		err.println("参数为:Test180_2, String, Test180_2 的run()方法");
	}
	public void run(Test180_2 test,  String str, char c) {
		err.println("参数为:Test180_2, String, char的run()方法");
	}
}