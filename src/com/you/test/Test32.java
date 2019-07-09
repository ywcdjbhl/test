package com.you.test;

public class Test32 {
	public void test() throws ArithmeticException{
		Integer i=0;
		if(i==0){
			throw new ArithmeticException();
		}
	}
	public static void main(String[] args){
		Test32 test=new Test32();
		test.test();
	}
}
