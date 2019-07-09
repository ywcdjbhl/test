package com.you.test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test317 {
	
	public void getTime (int a, int b, int c, int d, int e, int f) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		list.add(f);
		Collections.sort(list);
		PrintStream err = System.err;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > 2) {
				continue;
			}
			String result = "" + list.get(i);
			for (int j = 0; j < list.size(); j++) {
				if (!removal(i, j)) {
					continue;
				}
				if (list.get(i) == 2 && list.get(j) > 4) {
					continue;
				}
				String result2 = result + list.get(j);
				for (int k = 0; k < list.size(); k++) {
					if (!removal(i, j, k)) {
						continue;
					}
					if (list.get(k) > 5) {
						continue;
					}
					if (list.get(i) == 2 && list.get(j) == 4 && k > 0) {
						continue;
					}
					String result3 = result2 + list.get(k);
					for (int l = 0; l < list.size(); l++) {
						if (!removal(i, j, k, l)) {
							continue;
						}
						if (list.get(i) == 2 && list.get(j) == 4 && list.get(l) > 0) {
							continue;
						}
						String result4 = result3 + list.get(l);
						for (int m = 0; m < list.size(); m++) {
							if (!removal(i, j, k, l, m)) {
								continue;
							}
							if (list.get(m) > 5) {
								continue;
							}
							if (list.get(i) == 2 && list.get(j) == 4 && m > 0) {
								continue;
							}
							String result5 = result4 + list.get(m);
							for (int n = 0; n < list.size(); n++) {
								if (!removal(i, j, k, l, m, n)) {
									continue;
								}
								if (list.get(i) == 2 && list.get(j) == 4 && n > 0) {
									continue;
								}
								String result6 = result5 + list.get(n);
								err.println(result6);
								return;
							}
						}
					}
				}
			}
		}
		err.println("NOT");
	}

	public boolean removal(int... is) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i : is) {
			int size = set.size(); 
			set.add(i);
			if (set.size() == size) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Test317 test = new Test317();
		test.getTime(7, 9, 0, 0, 0, 0);
		test.getTime(1, 8, 3, 2, 6, 4);
		test.getTime(0, 0, 0, 7, 8, 9);
		test.getTime(2, 4, 5, 9, 5, 9);
	}
}
