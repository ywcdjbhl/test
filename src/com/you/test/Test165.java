//package com.you.test;
//
//import java.io.PrintStream;
//import java.net.URL;
//import java.net.URLClassLoader;
//
//import urlclassloadertest.ActionInterface;
//
//public class Test165 {
//	public static void main(String[] args) {
//		try {
//			URL url = new URL("file:/G:jartest.jar");
//			URLClassLoader myClassLoader = new URLClassLoader(new URL[]{url});			
//			Class myClass = myClassLoader.loadClass("jartest.TestAction");
//			ActionInterface testAction = (ActionInterface)myClass.newInstance();
//			String str = testAction.action();
//			PrintStream err = System.err;
//			err.println(str);
//		} catch (Exception e) {e.printStackTrace();}
//	}
//}
