package com.you.test;

import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

public class Test148 {
	public static void main(String[] args) {
		List<Test148> list = new LinkedList<Test148>();
		List<String> list2 = new LinkedList<String>();
//		list.addAll(list2);
		List<Test148_2> list3 = new LinkedList<Test148_2>();
		list3.add(new Test148_2());
		boolean flag = list.addAll(list3);
		PrintStream err = System.err;
		err.println("flag = " + flag);
		err.println(list);
	}
}
class Test148_2 extends Test148 {
	
}
