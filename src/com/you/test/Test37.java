package com.you.test;

public class Test37 {
	public void run() throws Exception {
		try {
			throw new Exception();	
		} catch (Exception e) {
			
		}
		
		int i = 1;
		java.io.PrintStream err=System.err;
		err.println(i);
	}
	public static void main(String[] args) throws Exception {
		new Test37().run();
	}
}
