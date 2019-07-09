package com.you.test;

import java.util.ArrayList;
import java.util.List;

public class Test262 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		List list2 = new ArrayList();
		list2.add(6);
		list2.add(7);
		list2.add(8);
		list2.add(9);
		list2.add(10);
		list.addAll(1,list2);
		System.err.println(list);
		System.err.println(list2);
	}
}
