package com.you.test;
import java.io.PrintStream;
public class Test264 {
	public static void main(String[] args) {
		double[] ds = {};
		double[] ds2 = {};
		PrintStream err = System.err;
		err.println(ds);
		err.println(ds2);
		err.println(ds2 == ds);
		double[] ds3 = {1};
		double[] ds4 = {1};
		err.println(ds3);
		err.println(ds4);
		err.println(ds4 == ds3);
	}
}
