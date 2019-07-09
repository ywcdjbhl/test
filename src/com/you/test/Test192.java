package com.you.test;

import java.lang.reflect.Method;

public class Test192 {
	public static void main(String[] args) {
		Class<Test192_2> clazz = Test192_2.class;
		Method[] methods = clazz.getDeclaredMethods();
		Method method = methods[0];
		Class<?>[] clazzs = method.getParameterTypes();
		for (Class<?> paramclazz : clazzs) {
			System.out.println(paramclazz.getName());
		}
	}
}
class Test192_2 {
	public void run(Test192 test, Test192_2 test2, int i, String str) {
		
	}
}
