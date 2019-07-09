package com.you.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test278 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Iterator it = list.iterator();
		System.out.println(it.next());
		list.add(5);
		it.next();
	}
}
