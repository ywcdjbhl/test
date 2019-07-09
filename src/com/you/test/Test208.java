package com.you.test;
import java.lang.reflect.Field;
import java.io.PrintStream;
public class Test208 {
	public static void main(String[] args) {
		try {
			Class<?> clazz = Test208_2.class;	
			Field[] fs = clazz.getFields();
			PrintStream err = System.err;
			for (Field f : fs) {
				err.println(f);
				err.println(f.getName());
				err.println(f.getType());
			}
			err.println("---------------");
			fs = clazz.getDeclaredFields();
			for (Field f : fs) {
				err.println(f);
				err.println(f.getName());
				err.println(f.getType());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class Test208_2 {
	public String str;
	Test208_2 test;
	protected float fl;
	Character ch;
}

