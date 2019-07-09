package com.you.test;

import java.io.PrintStream;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test129 {
	public static void main(String[] args) {
		List list = new LinkedList();
		list.add(new Test129());
		list.add(new Test128());
		list.add(new Test127());
		list.add(new Test126());
		list.add(new Test125());
		Collections.fill(list, new Test111());
		PrintStream err = System.err;
		err.println(list.get(0));
		err.println(list.get(1));
		err.println(list.get(2));
		err.println(list.get(3));
		err.println(list.get(4));
		err.println(list.get(5));
	}
}
