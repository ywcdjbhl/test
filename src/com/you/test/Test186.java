package com.you.test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Test186 {
	public static void main(String[] args) {
		Test186ClassLoader loader = new Test186ClassLoader("myloader");
		try {
			Class<?> clazz = loader.loadClass("com\\you\\test\\Test186_3");	
			clazz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
/**
 * 
 *自定义类加载器
 */
class Test186ClassLoader extends ClassLoader {
	private String name;
	// 通过这个构造方法生成的类加载器,它的父类是系统类加载器
	public Test186ClassLoader(String name2) {
		this.name = name2;
	}
	// 通过这个构造方法生成的类加载器,该加载器的父类是loader,如果是空,	则父加载器为根加载器
	public Test186ClassLoader(String name, ClassLoader loader) {
		super(loader);
		this.name = name;
	}
	public String toString() {
		return this.name;
	}
	// 要重写findClass方法,loadClass会调用它
	public Class<?> loadClass(String name) throws ClassNotFoundException {
		byte[] data = null;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream ("D:\\workspace_test51\\test\\WebContent\\WEB-INF\\classes\\" + name + ".class");	
		} catch (Exception e) {
			e.printStackTrace();
		}
		ByteArrayOutputStream abos = new ByteArrayOutputStream();
		int ch = 0;
		try {
			while(-1 != (ch = fis.read())) {
				abos.write(ch);// 把字节一个一个写到输出流中
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		data = abos.toByteArray();// 把输出流中的字节弄成一个字节数组
		return this.defineClass(name, data, 0, data.length, null);
	}
}
class Test186_3 {
	public Test186_3 () {
		PrintStream out = System.err;
		Class<?> clazz = this.getClass();
		out.println("类加载器为:" + clazz.getClassLoader());
	}
}

