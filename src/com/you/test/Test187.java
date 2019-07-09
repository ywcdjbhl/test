package com.you.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Test187 {
	public static void main(String[] args) {
		try {
			URL url = new URL("file://G://");
			URL[] urls = new URL[1];
			urls[0] = url;
			URLClassLoader loader = new URLClassLoader(urls);
			try {
				Class<?> clazz = loader.loadClass("com.you.test.Test99");
				try {
					ClassLoader cl = clazz.getClassLoader();
					System.out.println(cl);
					Test99 test = (Test99)clazz.newInstance();
					test.main(null);
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
