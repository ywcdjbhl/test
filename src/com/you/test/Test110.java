package com.you.test;
import java.math.BigDecimal;
public class Test110 {
	public static void main(String[] args) {
		BigDecimal b = BigDecimal.valueOf(3);
		BigDecimal b2 = BigDecimal.valueOf(10);
		System.out.println(b2.divide(b,2));
	}
}
