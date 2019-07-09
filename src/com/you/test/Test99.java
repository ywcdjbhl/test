package com.you.test;
import java.io.PrintStream;
import java.math.BigDecimal;
public class Test99 {
	public static void main(String[] args) {
		BigDecimal bd = new BigDecimal(3.3000);
		BigDecimal bd2 = new BigDecimal(3.3);
		PrintStream err = System.err;
		err.println(bd2);
		err.println(bd); 
		err.println(bd.compareTo(bd2));
		err.println(bd.equals(bd2));
		BigDecimal bd3 = new BigDecimal(0);
		err.println(bd3.equals(BigDecimal.ZERO));
		
	}
}
