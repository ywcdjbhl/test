package com.you.test;

public class Test261 {
	
	public static void main(String[] args) {
		Object obj = Test261_2.class;	
	}
}

enum Test261_2 {
	Name1(new Test261_3()),
	Name2(new Test261_3()),
	Name3(new Test261_3()),;
	private Test261_3 name;
	private Test261_2 (Test261_3 test) {
		
	}
}

class Test261_3 {
	public Test261_3() {
		System.out.println(this);
	}
} 
