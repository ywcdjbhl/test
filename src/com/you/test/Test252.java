package com.you.test;

import java.io.FileInputStream;
import java.io.InputStream;

public class Test252 {
	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream("G://1.properties");	
			byte[] bs = new byte[8];
			for (int i = 0; i < bs.length; i++) {
				bs[i]=20;
			}
			while (true) {
				in.read(bs);
				for (int i = 0; i < bs.length; i++) {
					System.err.print(" " + bs[i]);
				}	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
