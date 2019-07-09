package com.you.test;

import javax.servlet.http.HttpServletRequest;

public class Test195 {
	public static void main(String[] args) {
		Class clazz = HttpServletRequest.class;
		try {
			clazz.newInstance();	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
