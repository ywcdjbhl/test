package com.you.test;

public class Test18 {
	public static void main(String[] args){
		java.io.PrintStream err=System.err;
		err.println("".matches("^\\d+(\\.\\d+)?$"));
		err.println("  ".matches("^\\d+(\\.\\d+)?$"));
		err.println(".".matches("^\\d+(\\.\\d+)?$"));
		err.println("2".matches("^\\d+(\\.\\d+)?$"));
		err.println("..0990023".matches("^\\d+(\\.\\d+)?$"));
		err.println("-------------------");
		err.println("".matches("^\\d+$"));
		err.println("-------------------");
		err.println("2010-02-21".matches("^((?:201)\\d)-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$"));
	}
}
