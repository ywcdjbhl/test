package com.you.test;
import java.io.File;
import java.io.PrintStream;
import java.net.URI;
import java.net.URL;
public class Test199 {
	public static void main(String[] args) {
		try {
			URL url = new URL("file:/G:/tencentvideo");	
			PrintStream err = System.err;
			err.println("url=" + url);
			URI uri = url.toURI();
			err.println("uri=" + uri);
			String fileStr = url.getFile();
			err.println("file=" + fileStr);
			String host = url.getHost();
			err.println("host=" + host);
			String path = url.getPath();
			err.println("path=" + path);
			String protocol = url.getProtocol();
			err.println("protocol=" + protocol);
			String auth = url.getAuthority();
			err.println(auth == null);
			String query = url.getQuery();
			err.println(null == query);
			String ref = url.getRef();
			err.println("ref=" + ref);
			File file = new File(uri);
			err.println(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
