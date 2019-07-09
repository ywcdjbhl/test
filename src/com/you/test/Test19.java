package com.you.test;
import java.io.PrintStream;
public class Test19 {
	public static void main(String[] args){
		PrintStream err=System.err;
		int i=Integer.MAX_VALUE;
		String i2=i+"";
		err.println(i2.length());
	}
}
