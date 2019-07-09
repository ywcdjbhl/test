package com.you.test;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;
public class Test79 {
	public int hashCode() {
		return 333;
	}
	
	public boolean equals(Object obj) {
		return obj.hashCode() == 333;
	}
	
	public static void main(String[] args) {
		Set<Test79> set = new HashSet<Test79>();
		Test79 test = new Test79();
		Test79 test2 = new Test79();
		set.add(test);
		set.add(test2);
		PrintStream err = System.err;
		err.println(set.size());
	}
}
