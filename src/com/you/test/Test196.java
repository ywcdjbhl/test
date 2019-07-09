package com.you.test;

import javax.servlet.http.HttpServletRequest;

public class Test196 {
	public static void main(String[] args) {
		Class clazz = HttpServletRequest.class;
		try {
			clazz.getConstructor();	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
