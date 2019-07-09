package com.you.test;
import java.io.PrintStream;
public class Test321 {
	public static void main(String[] args) throws Exception {
		String s = "hello";
		byte[] bs = s.getBytes("UTF-8");
		PrintStream err = System.err;
		for (byte b : bs) {
			err.print(b);
		}
		err.println();
		bs = s.getBytes("GBK");
		for (byte b : bs) {
			err.print(b);
		}
		err.println();
		err.println("-------------");
		s = "回家";
		bs = s.getBytes("UTF-8");
		for (byte b : bs) {
			err.print(b);
		}
		err.println();
		bs = s.getBytes("GBK");
		for (byte b : bs) {
			err.print(b);
		}
		
	}
}
