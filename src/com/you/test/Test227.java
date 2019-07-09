package com.you.test;
import java.io.PrintStream;

import javax.servlet.http.HttpServletRequest;

import org.jdom2.JDOMConstants;
public class Test227 {
	public static void main(String[] args) {
		ClassLoader cl = new String().getClass().getClassLoader();
		PrintStream err = System.err;
		err.println(cl);
		cl = Test227.class.getClassLoader();
		err.println(cl);
		cl = HttpServletRequest.class.getClassLoader();
		err.println(cl);
		cl = JDOMConstants.class.getClassLoader();
		err.println(cl);
		cl = cl.getClass().getClassLoader();
		err.println(cl);
	}
}
