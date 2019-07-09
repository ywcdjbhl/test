package com.you.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

public class Test275 {
	PrintStream err = System.err;
	static Set<String> set = new HashSet<String>();
	static {
		set.add("spring-aop");
		set.add("spring-aspects");
		set.add("spring-beans");
		set.add("spring-context");
		set.add("spring-context-indexer");
		set.add("spring-context-support");
		set.add("spring-core");
		set.add("spring-expression");
		set.add("spring-instrument");
//		set.add("spring-jcl");
		set.add("spring-jdbc");
		set.add("spring-jms");
		set.add("spring-messaging");
		set.add("spring-orm");
		set.add("spring-oxm");
		set.add("spring-test");
		set.add("spring-tx");
		set.add("spring-web");
		set.add("spring-webflux");
		set.add("spring-webmvc");
		set.add("spring-websocket");
	}
	public static void main(String[] args) throws Exception {
		Test275 test = new Test275();
		for (String module : set) {
			String path = "P:\\jar\\spring-framework2\\" + module + "\\src\\main\\java\\org\\springframework";
			File file = new File(path);
			test.run(file);
		} 
	}
	
	public void run(File file) throws Exception {
		if (file.isDirectory()) {
			// 是文件夹
			String path = file.getPath();
			int i = path.lastIndexOf("springframework");
			if (i + 15 < path.length()) {
				path = path.substring(i + 16);
				File newfile = new File("D://springcopy/org/springframework/" + path);
				newfile.mkdirs();
			}
			File[] files = file.listFiles();
			for (File onefile : files) {
				run(onefile);
			}
		} else {
			// 是文件,复制文件内容
			String path = file.getPath();
			
			int i = path.lastIndexOf("springframework");
			if (i + 15 < path.length()) {
				path = path.substring(i + 16);
			}
			File newfile = new File("D://springcopy/org/springframework/" + path);
			err.println(newfile);
			newfile.createNewFile();
			copy(file, newfile);	
		}
	}
	
	public void copy(File fromfile, File tofile) throws Exception {
		InputStream in = new FileInputStream(fromfile);
		OutputStream out = new FileOutputStream(tofile);
		while (true) {
			int i = in.read();
			if (i == -1) {
				break;
			}
			out.write(i);
		}
	}
}
