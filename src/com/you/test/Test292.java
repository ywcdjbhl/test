package com.you.test;

public class Test292 {
	public static void main(String[] args) {
		int[] is = new int[] {1, 2, 3, 4, 5};
		int[] is2 = new int[] { 0, 0, 0, 0, 0 };
		System.arraycopy(is2,0,is,0,5);
		System.out.println(is[0] + is[1] + is[2] + is[3] + is[4]);
		System.out.println(is2[0] + is2[1] + is2[2] + is2[3] + is2[4]);
	}
}
