package com.you.test;

import java.io.PrintStream;
import java.net.InetAddress;

public class Test214 {
	public static void main(String[] args) {
		try {
			Object obj = InetAddress.getByName("[]");	
			PrintStream err = System.err;
			err.println(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
