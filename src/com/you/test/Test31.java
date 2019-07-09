package com.you.test;

public class Test31 {
	public void play() throws ClassNotFoundException{
		Integer i=0;
		if(i==0){
			
			throw new ClassNotFoundException("i=0");
		}
	}
	public static void main(String[]args){
		Test31 test=new Test31();
		try{
			test.play();	
		}catch(ClassNotFoundException e){
			//System.out.println(e);
		}
		
	}
}
