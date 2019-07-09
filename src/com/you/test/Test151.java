package com.you.test;

import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

public class Test151 {
	public static void main(String[] args) {
		List<Test151> list = new LinkedList<Test151>();
		list.add(new Test151());
		Class clazz = list.getClass();
		try {
			Method[] method = clazz.getMethods();
			for (Method m : method) {
				System.out.println(m);
			}
//			method.invoke(list, new Test151());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
	