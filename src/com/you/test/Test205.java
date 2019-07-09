package com.you.test;

public class Test205 {
	public static void main(String[] args) {
		Test205_2 test = new Test205_2();
	}
}
class Test205_2 {
	private Test205_3 test = new Test205_3(this.dl);
	private Test205_3 test2 = new Test205_3(this);
	private Test205_3 test3 = new Test205_3(this.str);
	private double dl = 4D;
	private String str = "hello";
	public Test205_2() {
		System.out.println("this=" + this);
		System.out.println("this.test=" + this.test);
		this.run();
		
	}
	public void run() {
		System.out.println("run()");
	}
}
class Test205_3 {
	public Test205_3(Object obj) {
		System.out.println("TEST205_3构造方法");
		System.out.println("参数为:" + obj);
	}
}
	