package com.you.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Test168 {
	public static void main(String[] args) throws Exception {
		InputStream in = new FileInputStream("G:/Test99.java");
		byte[] bytes = new byte[20000];
		PrintStream err = System.err;
		int i = in.read(bytes);	
		err.println("读取了 " + i + " 个字节");
		String s = new String(bytes);
		err.println(s);
		OutputStream out = new FileOutputStream("G:/out.txt");
		out.write(bytes);
	}
}
