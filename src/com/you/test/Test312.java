package com.you.test;

import java.math.BigDecimal;

public class Test312 {
	public static void main(String[] args) {
		BigDecimal bd = new BigDecimal(3.01);
		bd = bd.setScale(0, BigDecimal.ROUND_CEILING);
		System.err.println(bd);
		bd = bd.setScale(1, BigDecimal.ROUND_CEILING);
		bd = new BigDecimal(5.000);
		bd = bd.setScale(0, BigDecimal.ROUND_CEILING);
		System.err.println(bd);
	}
}
