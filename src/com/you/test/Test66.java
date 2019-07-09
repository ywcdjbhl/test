package com.you.test;

import java.math.BigDecimal;

public class Test66 {
	public static void main(String[] args) {
		BigDecimal mount = new BigDecimal(100);
		BigDecimal mount2 = new BigDecimal(139);	
		BigDecimal num = mount.divide(mount2, 2, BigDecimal.ROUND_HALF_UP);
		System.out.println(num);
	}
}
