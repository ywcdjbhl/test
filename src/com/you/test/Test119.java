package com.you.test;

import java.io.FileInputStream;
import java.io.InputStream;

public class Test119 extends SecurityManager {
	@Override
	public void checkRead(String file) {
		if (file.contains(".xml")) {
			throw new SecurityException("没有权限读取xml文件");
		} 
	}
	
	public static void main(String[] args) {
		System.setSecurityManager(new Test119());
		
		try {
			InputStream in = new FileInputStream("d://1.xml");	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
