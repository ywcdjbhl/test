package com.you.test;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
public class Test256 {
	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream("G:/1.doc");
			byte[] bs = new byte[4];
			in.read(bs);
			PrintStream err = System.err;
			for (int i = 0; i < bs.length; i++) {
				char c = (char) (0xff & bs[i]);
				err.println(c == '\\');	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
