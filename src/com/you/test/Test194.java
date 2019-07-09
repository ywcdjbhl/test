package com.you.test;

import java.io.PrintStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Test194 {
	public static void main(String[] args) {
		Class<?> clazz = Test194_2.class;
		Method method = clazz.getDeclaredMethods()[0];
		PrintStream err = System.err;
		err.println(method);
		Annotation[][] pa = method.getParameterAnnotations();
		for (int i = 0; i < pa.length; i++) {
			for (Annotation a : pa[i]) {
				err.println(a);
			}
		}
	}
}
class Test194_2 {
	public void run(Test194 test, String str, float fl) {
		
	}
}
