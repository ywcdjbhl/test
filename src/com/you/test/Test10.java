package com.you.test;
import java.math.BigDecimal;
import java.io.PrintStream;
public class Test10 {
	public static void main(String[] args){
		BigDecimal bg=new BigDecimal("");
		PrintStream err=System.err;
		err.println(bg);
	}
}
