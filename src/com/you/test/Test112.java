package com.you.test;

import java.net.HttpURLConnection;
import java.net.URL;

public class Test112 {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://127.0.0.1:8080/web/test2.do");	
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setRequestMethod("POST");
			conn.setDoInput(true);
			conn.setDoOutput(true);
			conn.setRequestProperty("num", "2");
			conn.getInputStream();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
