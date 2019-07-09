package com.you.test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test316 {
	public void sort(int a, int b, int c, int d, int e, int f) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		list.add(f);
		PrintStream err = System.err;
		int time = 0;
		for (int i = 0; i < list.size(); i++) {
			String result = "" + list.get(i);
			for (int j = 0; j < list.size(); j++) {
				String result2 = result + list.get(j);
				for (int k = 0; k < list.size(); k++) {
					String result3 = result2 + list.get(k);
					for (int l = 0; l < list.size(); l++) {
						String result4 = result3 + list.get(l);
						for (int m = 0; m < list.size(); m++) {
							String result5 = result4 + list.get(m);
							for (int n = 0; n < list.size(); n++) {
								String result6 = result5 + list.get(n);
								err.println(result6);			
								time++;
							}
						}
					}
				}
			}
		}
		err.println("time=" + time);
	}
	
	public void sort2(int a, int b, int c, int d, int e, int f) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		list.add(f);
		PrintStream err = System.err;
		int time = 0;
		for (int i = 0; i < list.size(); i++) {
			String result = "" + list.get(i);
			for (int j = 0; j < list.size(); j++) {
				if (!quchong(i, j)) {
					continue;
				}
				String result2 = result + list.get(j);
				for (int k = 0; k < list.size(); k++) {
					if (!quchong(i, j, k)) {
						continue;
					}
					String result3 = result2 + list.get(k);
					for (int l = 0; l < list.size(); l++) {
						if (!quchong(i, j, k, l)) {
							continue;
						}
						String result4 = result3 + list.get(l);
						for (int m = 0; m < list.size(); m++) {
							if (!quchong(i, j, k, l, m)) {
								continue;
							}
							String result5 = result4 + list.get(m);
							for (int n = 0; n < list.size(); n++) {
								if (!quchong(i, j, k, l, m, n)) {
									continue;
								}
								String result6 = result5 + list.get(n);
								err.println(result6);			
								time++;
							}
						}
					}
				}
			}
		}
		err.println("time=" + time);
	}
	
	public boolean quchong(int ...is) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i : is) {
			int size = set.size();
			set.add(i);
			int size2 = set.size();
			if (size == size2) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Test316 test = new Test316();
		test.sort(2, 3, 4, 5, 6, 7);
		test.sort2(2, 3, 4, 5, 6, 7);
	}
}
