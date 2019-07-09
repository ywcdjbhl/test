package com.you.test;

public class Test29 {
	public void Test29(){
		Integer i=0;
		if(i==0){
			throw new NumberFormatException("i=0了");
		}
	}
	public static void main(String[] args){
		Test29 Test29=new Test29();
		Test29.Test29();
	}
}
