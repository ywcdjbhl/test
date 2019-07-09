package com.you.test;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Method;
/**
 * 代理类实现类
 * 
 */
public class Test181 implements InvocationService {
	@Override
	public void invoke(Object obj, Method method) {
		
	}
	@Override 
	public void daili(Object obj, Method method,Object... params) { 
		File file = new File("G:/proxy.txt");
		try {
			FileWriter writer = new FileWriter(file);
			writer.write("before proxy");
			method.invoke(obj, params);
			writer.write("after proxy");
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
