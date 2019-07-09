package com.you.test;
import java.io.PrintStream;
public class Test69 {
	public static void main(String[] args) {
		Long max = Long.MAX_VALUE;
		PrintStream err = System.err;
		err.println(max.toString().length());
	}
}
