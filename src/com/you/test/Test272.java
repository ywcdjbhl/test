package com.you.test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Test272 {
	public static void main(String[] args) {
		List<Double> list = new ArrayList<Double>();
		list.add(1D);
		list.add(2D);
		list.add(3D);
		list.add(4D);
		Test272[] ts = new Test272[8];
		Test272[] ts2 = list.toArray(ts);
		PrintStream err = System.err;
		for (Test272 t : ts2) {
			err.println(t);
		}
	}
}
