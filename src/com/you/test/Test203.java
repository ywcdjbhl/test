package com.you.test;

import java.security.AccessControlContext;

public class Test203 {
	private static native AccessControlContext getStackAccessControlContext();
	public static void main(String[] args) {
		SecurityManager sm = new SecurityManager();
		sm.checkPermission(null);
	}
	
}
