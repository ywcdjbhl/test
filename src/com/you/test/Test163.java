package com.you.test;
import java.io.File;
import java.io.PrintStream;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
public class Test163 {
	public static void main(String[] args) {
		PrintStream err = System.err;
		try {
			File file = new File("G:\\xiami\\XMusic");	
			err.println(file);
			URI uri = file.toURI();
			err.println(uri);
			URL url = uri.toURL();
			err.println(url);
			URLClassLoader loader = new URLClassLoader(new URL[]{url});
			err.println(loader);
		} catch (Exception e) {
			
		}
	}
}
