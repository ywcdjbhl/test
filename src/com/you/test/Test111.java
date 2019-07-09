package com.you.test;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Test111 {
	public static void test() throws Exception {
		URL url = new URL("http://127.0.0.1:8080/web/test.do?");
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		conn.setRequestProperty("appid", "ooooooooo");
		conn.setRequestMethod("POST");
		conn.setDoOutput(true);
		conn.setDoInput(true);
		OutputStream out = conn.getOutputStream();
		String param = "昨日想那东流水";
		out.write(param.getBytes("UTF-8"));		
		InputStream in = conn.getInputStream();
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		while (true) {
			int i = in.read();
			if (i == -1) {
				break;
			}
			bao.write(i);
		}
		PrintStream err = System.err;
		err.println(bao.toString());
	}
	public static void main(String[] args) throws Exception {
		for (;;) {
			Thread.sleep(3000);
			test();
		}
	}
}
