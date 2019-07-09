package com.you.test;
import java.io.PrintStream;
public class Test9 {
	public static void main(String[] args){
		String s=",1,1,1,1,";
		String[] ss=s.split(",");
		PrintStream err=System.err;
		err.println(ss.length);
		for(String s2:ss){
			err.println(s2);
		}
	}
}
