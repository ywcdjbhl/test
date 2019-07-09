package com.you.test;

import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

public class Test149 implements Test149_2 {
	public static void main(String[] args) {
		List<Test149_2> list = new LinkedList<Test149_2>();
		List<Test149> list2 = new LinkedList<Test149>();
		list.addAll(list2);
		list2.add(new Test149());
		PrintStream err = System.err;
		err.println(list);
	}
}
interface Test149_2{
	
}
