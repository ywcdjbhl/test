package com.you.test;

import java.util.LinkedList;
import java.util.List;

public class Test150{
	public void run(List<? extends Number> list) {
		list.add(null);
	}
	public static void main(String[] args) {
		List<? extends Number> list = new LinkedList();
	}
}
