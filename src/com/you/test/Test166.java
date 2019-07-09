package com.you.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * HttpServer类
 *
 */
public class Test166 {
	public static final String WEB_ROOT = System.getProperty("user.dir");
	private static final String SHUTDOWN_COMMAND = "/SHUTDOWN";
	
	private boolean shutdown = false; 
	
	public static void main(String[] args) {
		Test166 server = new Test166();
		PrintStream err = System.err;
		err.println("启动服务器");
		server.await();
	}
	
	public void await() {
		PrintStream err = System.err;
		ServerSocket serverSocket = null;
		int port = 8080;
		try {
			serverSocket = new ServerSocket(port, 1, InetAddress.getByName("127.0.0.1"));	
		} catch (Exception e) {
			e.printStackTrace();
			err.println("NEW SERVERSOCKET 异常。。。。");
			System.exit(1);
		}

		while (!shutdown) {
			err.println("执行AWAIT循环。。。。。");
			Socket socket = null;
			InputStream in = null;
			OutputStream out = null;
			try {
				socket = serverSocket.accept();
				in = socket.getInputStream();
				out = socket.getOutputStream();
				
				Test166Request request = new Test166Request(in);
				request.parse();
				
				Test166Response response = new Test166Response(out);
				response.setRequest(request);
				response.sendStaticResource();
				
				socket.close();
				
				shutdown = request.getUri().equals(SHUTDOWN_COMMAND);
			} catch (IOException e) {
				e.printStackTrace();
				continue;
			}
		}
	}
	
}

class Test166Request {
	private InputStream input;
	private String uri;
	public Test166Request(InputStream in) {
		input = in;
	}
	public void parse() {
		StringBuffer request = new StringBuffer(2048);
		int i;
		byte[] buffer = new byte[2048];
		try {
			i = input.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
			i = -1;
		}
		for (int j = 0; j < i; j++) {
			request.append((char) buffer[j]);
		}
		System.out.println("REQUEST请求:requestString--------\n" + request.toString());
		uri = parseUri(request.toString());
		System.out.println("uri = " + uri);
	}
	private String parseUri(String requestString) {
		int index1, index2;
		index1 = requestString.indexOf(' '); 
		if (index1 != -1) {
			index2 = requestString.indexOf(' ', index1+1);
			if (index2 > index1) {
				return requestString.substring(index1 + 1, index2);
			}
		}
		return null;
	}
	public String getUri() {
		return uri;
	}
}
class Test166Response {
	Test166Request request;
	OutputStream output;
	
	public Test166Response(OutputStream out) {
		output = out;
	}
	
	public void setRequest(Test166Request request2) {
		request = request2;
	}
	
	public void sendStaticResource() throws IOException {
		byte[] bytes = new byte[1024];
		FileInputStream fis = null;
		try {
			PrintStream err = System.err;
			err.println("WEB_ROOT = " + Test166.WEB_ROOT);
			err.println("request.getUri() = " + request.getUri() );
			File file = new File(Test166.WEB_ROOT, request.getUri());
			if (file.exists()) {
				err.println(file + "存在");
				fis = new FileInputStream(file);
				int ch = fis.read(bytes, 0, 1024);
				while (ch != -1) {
					output.write(bytes, 0, ch);
					ch = fis.read(bytes, 0, 1024);
				}
			} else {
				err.println(file + "不存在");
				String errorMessage = "HTTP/1.1 404 NOT FOUND\r\n"
						+ "Content-Type:text/html\r\n"
						+ "Content-Length:23\r\n" + "\r\n"
						+ "<h1>FILE NOT FOUND</h1>";
				output.write(errorMessage.getBytes());
			}	
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			if (fis != null) {
				fis.close();
			}
		}
	} 
}