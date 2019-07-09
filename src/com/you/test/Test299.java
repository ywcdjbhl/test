package com.you.test;
import java.io.PrintStream;
public class Test299 {
	public static void main(String[] args) {
		int i = Test299_2.HELLO.ordinal();
		PrintStream err = System.err;
		err.println(i);
		i = Test299_2.WORLD.ordinal();
		err.println(i);
		i = Test299_2.JACK.ordinal();
		err.println(i);
		i = Test299_2.LILY.ordinal();
		err.println(i);
		i = Test299_2.LUCY.ordinal();
		err.println(i);
	}
}
enum Test299_2 {
	HELLO,
	WORLD,
	JACK,
	LILY,
	LUCY;
}
