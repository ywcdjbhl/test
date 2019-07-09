package com.you.test;

import java.math.BigDecimal;

public class Test30 {
	public static void main(String[] args){
		BigDecimal bg=new BigDecimal("22222");
		Integer i=Integer.valueOf(bg.toString());
		System.out.println(i);
		bg=new BigDecimal(8989);
		i=Integer.valueOf(bg.toString());
		System.out.println(i);
	}
}
