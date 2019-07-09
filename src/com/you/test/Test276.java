package com.you.test;

import java.io.File;

public class Test276 {
	public static void main(String[] args) {
		File file = new File("D://");
		File[] files = file.listFiles();
		for (File onefile : files) {
			if (onefile.isFile() && onefile.getName().endsWith(".java")) {
				onefile.delete();
			}
		}
	}
}
