package com.you.test;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Properties;
public class Test259 {
	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream("G://1.properties");	
			Properties pro = new Properties();
			pro.load(in);
			PrintStream err = System.err;
			err.println(pro);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
