package com.you.test;

import java.io.File;
import java.io.PrintStream;
import java.net.URI;
import java.net.URL;

public class Test200 {
	public static void main(String[] args) throws Exception {
		URL url = new URL("file:/G:/fiddler");
		URL url2 = new URL("file:/G:/fiddler/Fiddler.exe.config");
		URI uri = url.toURI();
		URI uri2 = url2.toURI();
		File file =new File(uri);
		File file2 =new File(uri2);
		PrintStream err = System.err;
		err.println(file.isDirectory());
		err.println(file2.isDirectory());
		err.println(file.isFile());
		err.println(file2.isFile());
		err.println(file.isAbsolute());
		err.println(file2.isAbsolute());
	}
}
