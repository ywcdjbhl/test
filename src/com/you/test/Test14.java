package com.you.test;
import java.io.PrintStream;
public class Test14 {
	public static void main(String[] args){
		String s="dongge";
		s=s.replace("gg","oo");
		PrintStream err=System.err;
		err.println(s);
	}
}
