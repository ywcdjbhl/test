package com.you.test;
import java.io.PrintStream;
public class Test301 {
	PrintStream err = System.err;
	public void run(String... s) {
		err.println(s[0]);
	}
	public static void main(String[] args) {
		Test301 test = new Test301();
		test.run("hell", "sfe", "===");
	}
}
