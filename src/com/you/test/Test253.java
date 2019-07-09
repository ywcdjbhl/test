package com.you.test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Test253 {
	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream("G:/1.properties");	
			byte[] bs = new byte[3];
			PrintStream err = System.err;
			while (true) {
				int i = in.read(bs);	
				err.println(i);
				if (i == -1) {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
