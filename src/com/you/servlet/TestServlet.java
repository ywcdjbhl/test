package com.you.servlet;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
 
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class TestServlet extends HttpServlet{
	private PrintStream err=System.err;
	public TestServlet  (){
		err.println("构造方法");
	}
	public void init(){
		err.println("init");
	}
	public void service(HttpServletRequest request,HttpServletResponse response){
		err.println("service");
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response){
		err.println("doGet");
	}
	public void destroy(){
		try{
			OutputStream out=new FileOutputStream("d://text.txt");
			out.write(1);
			out.flush();
			out.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
