package com.you.test;

import java.io.PrintStream;
import java.lang.reflect.Method;

public class Test176 {
	public Test176 run(String s) {
		return null;
	}
	
	
	public static void main(String[] args) {
		Test176 test = new Test176();
		Class<?> clazz = test.getClass();
		PrintStream out = System.err;
		try {
			Method method = clazz.getMethod("run","sss".getClass());	
			out.println(method);
			Class<?> clazz2 = method.getReturnType();
			out.println(clazz2);
			Class<?>[] paramClazzs = method.getParameterTypes();
			for (int i = 0; i < paramClazzs.length; i++) {
				Class<?> paramClazz = paramClazzs[i];
				out.println(paramClazz.getName());
				out.println(paramClazz.getSimpleName());
			}
			Package packag = clazz.getPackage();
			if (packag == null) {
				out.println("包名:null");
			} else {
				out.println("包名:" + packag.getName());	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
