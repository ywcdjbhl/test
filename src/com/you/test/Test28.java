package com.you.test;
import java.io.PrintStream;
public class Test28 {
	private PrintStream err=System.err;
	public void play() throws Exception{
		err.println("ddd");
		Integer i=3;
		i++;
		err.println(i);
		if(i==43){
			throw new Exception();	
		}
		err.println(i);
		err.println("ddd");
	}
	public static void main(String[] args) throws Exception{
		Test28 test=new Test28();
		test.play();
	}
}
