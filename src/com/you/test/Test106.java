package com.you.test;
import java.math.BigDecimal;
public class Test106 {
	public static void main(String[] args) {
		BigDecimal price = BigDecimal.valueOf(122);
		BigDecimal price2 = BigDecimal.valueOf(122);
		BigDecimal price3 = BigDecimal.valueOf(122);
		System.out.println(price.add(price2).add(price3));
	}
}
