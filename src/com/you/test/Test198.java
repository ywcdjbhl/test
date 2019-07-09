package com.you.test;
import java.io.File;
import java.io.PrintStream;
import java.net.URI;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
public class Test198 {
	private static List<String> filenames = new LinkedList<String>();
	public static void main(String[] args) {
		try {
			Test198 test = new Test198();
			Class<?> clazz = test.getClass();
			ClassLoader loader = clazz.getClassLoader();
			URL url = loader.getResource("");
			PrintStream err = System.err;
			err.println("url=" + url);
			URI uri = url.toURI();	
			err.println("uri=" + uri);
			File file = new File(uri);
			// 循环找出里面所有的.class文件
			getFile(file);
			List<String> classfilename = new LinkedList<String>();
			err.println("------------------");
			for (String filename : filenames) {
				if (filename.endsWith(".class")) {
					err.println(filename);
					classfilename.add(filename);
				}
			}
			err.println("------------------");
			List<String> classnames = new LinkedList<String>();
			List<Class<?>> clazzList = new LinkedList<Class<?>>();
			for (String filename : filenames) {
				if (filename.endsWith(".class")) {
					String classname = "com.you.test." + filename.replace(".class", "");
					err.println("classname=" + classname);
					classnames.add(classname);
					try {
						Class<?> clazz2 = Class.forName(classname);	
						clazzList.add(clazz2);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void getFile(File file) {
		File[] files = file.listFiles();
		for (File sonfile : files) {
			if (sonfile.isDirectory()) {
				// 是文件夹
				getFile(sonfile);
			} else {
				String filename = sonfile.getName();
				System.out.println("filename=" + filename);
				filenames.add(filename);
			}
		}
	}
}
