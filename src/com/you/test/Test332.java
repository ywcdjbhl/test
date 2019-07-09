package com.you.test;

import java.util.ArrayList;
import java.util.List;

public class Test332 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		List<Test332> list2 = new ArrayList<Test332>();
		list.add(3);
		Integer i = list.get(0);
		list2.add(new Test332());
		Test332 test = list2.get(0);
		Class clazz = list.getClass();
		Class clazz2 = list2.getClass();
		System.out.println(clazz == clazz2);
		
	}
}
