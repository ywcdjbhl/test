package com.you.test;

import java.io.PrintStream;
import java.math.BigDecimal;

public class Test215 {
	public static void main(String[] args) {
		Object obj = BigDecimal.ZERO;
		Object obj2 = BigDecimal.ZERO.ZERO.ZERO.ZERO;
		PrintStream err = System.err;
		err.println(obj == obj2);
	}
}
