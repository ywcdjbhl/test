package com.you.test;

public class Test260 {
	public Test260() throws Exception {
		int i = 1 / 0;
	}
	public static void main(String[] args) {
		try {
			new Test260();	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
