package com.you.test;
import java.io.File;
public class Test210 {
	public static void main(String[] args) {
		File file = new File("G://xiami", "xiami_yinyue_2.0.2.1618bd.exe");
		java.io.PrintStream err = System.err;
		err.println(file);
		err.println(file.exists());
	}
}
