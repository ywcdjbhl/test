package com.you.test;

public class Test263 {
	public static void main(String[] args) {
		int[] is = {1,2,3,4,5};
		int[] is2 = {6,7,8,9,10,11,12,13,14,15,16,17,18};
		System.arraycopy(is, 0, is2, 3, 4);
		for (int i : is) {
			System.err.print(i + " ");
		}
		System.err.println();
		for (int i : is2) {
			System.err.print(i + " ");
		}
	}
}
