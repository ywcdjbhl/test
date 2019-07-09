package com.you.test;

import java.util.Scanner;

public class Test268 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String result = "";
		String[] parts = str.split(",");
		for (String part : parts) {
			String downStr = part.substring(2);
			char[] cs = downStr.toCharArray();
			result = result + part + " ";
			boolean after_ = false;
			for (char c : cs) {
				if (c == '_') {
					after_ = true;
					continue;
				}
				char c2 = Character.toLowerCase(c);
				if (after_) {
					c2 = Character.toUpperCase(c2);
					after_ = false;
				}
				result = result + c2;
			}
			result = result + ",\n\t\t\t\t";
		}
		result = result.substring(0, result.length() - 6);
		System.out.println(result);
	}
}
