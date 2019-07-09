package com.you.test;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

public class Test218 {
	public static void main(String[] args) throws Exception {
		InputStream in = new FileInputStream("G:\\360DrvMgrInstaller_net.exe");
		byte[] buff = new byte[12233];
		int i = in.read(buff);
		System.out.println(i);
		Reader read = new FileReader("G:\\out.txt");
		char[] cs = new char[222000];
		i = read.read(cs);
		System.out.println(i);
	}
	
}
