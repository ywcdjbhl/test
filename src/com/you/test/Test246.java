package com.you.test;
import java.io.PrintStream;
public class Test246 {
	public static void main(String[] args) {
		// 以上代码中digit方法的作用是返回radix进制的字符ch所表示的十进制数
		int ch = '7';
		int radix = 8;
		int num = Character.digit(ch, radix);
		PrintStream err = System.err;
		err.println("" + (int)ch + " (radix=" + radix + ") =" +num);
	}
}
