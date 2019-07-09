package com.you.test;

import java.security.AccessController;

public class Test224 {
	public static void main(String[] args) {
		AccessController.checkPermission(null);
	}
}
