package com.you.test;

public class Test217 {
	public static void main(String[] args) {
		Class clazz_1 = null;
		Class clazz_2 = null;
		Class clazz_3 = null;
		Class clazz_4 = null;
		Class clazz_5 = null;
		try {
			clazz_1 = Class.forName("com.you.test.Test217_1");	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			clazz_2 = Class.forName("com.you.test.Test217_2");	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			clazz_3 = Class.forName("com.you.test.Test217_3");	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			clazz_4 = Class.forName("com.you.test.Test217_4");	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			clazz_5 = Class.forName("com.you.test.Test217_5");	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			clazz_1.newInstance();	
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e2) {
			e2.printStackTrace();
		}
		try {
			clazz_2.newInstance();	
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e2) {
			e2.printStackTrace();
		}
		try {
			clazz_3.newInstance();	
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e2) {
			e2.printStackTrace();
		}
		try {
			clazz_4.newInstance();	
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e2) {
			e2.printStackTrace();
		}
		try {
			clazz_5.newInstance();	
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e2) {
			e2.printStackTrace();
		}
		
		
	}
}
class Test217_1 {
	
}
abstract class Test217_2 {
	public Test217_2() {
	
	}
}

interface Test217_3 {

}

enum Test217_4 {
	
}

@interface Test217_5 {
	
}
