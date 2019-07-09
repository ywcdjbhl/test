package com.you.test;
import java.util.Arrays;
public class Test128 {
	public static void main(String[] args) {
		int[] is = {3,4,5,6,7,8};
		Arrays.fill(is, -1);
		System.out.println(is[0]);
		System.out.println(is[1]);
		System.out.println(is[2]);
		System.out.println(is[3]);
		System.out.println(is[4]);
		System.out.println(is[5]);
		System.out.println("-----------------");
		Object[] objs = new Object[6];
		objs[0] = new Test128();
		objs[1] = new String("");
		objs[2] = new Test127();
		objs[3] = new Test126();
		Arrays.fill(objs, new Test111());
		System.out.println(objs[0]);
		System.out.println(objs[1]);
		System.out.println(objs[2]);
		System.out.println(objs[3]);
		System.out.println(objs[4]);
		System.out.println(objs[5]);
		System.out.println("-----------------");
		Object[] objs2 = {new Test128(), new Test127(), new Test126(), new Test125(), new Test123()};
		Arrays.fill(objs2, 1, 4, new Test111());
		System.out.println(objs2[0]);
		System.out.println(objs2[1]);
		System.out.println(objs2[2]);
		System.out.println(objs2[3]);
		System.out.println(objs2[4]);
		System.out.println(objs2[5]);
	}
}
