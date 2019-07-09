package com.you.test;

import java.io.PrintStream;

public class Test167 {
	public static void main(String[] args) {
		PrintStream err = System.err;
		err.println("while true");
		while (true);
	}
}
