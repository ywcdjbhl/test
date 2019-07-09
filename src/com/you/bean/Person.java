package com.you.bean;
import java.io.PrintStream;
import java.io.Serializable;
public class Person implements Serializable{
	private int age;
	private String name;
	private String home3;
	//private static final long serialVersionUID=-8675118531367921418l;
	public Person(){
		PrintStream err=System.err;
		err.println("构造方法");
	}
	public Person  (int age,String name,String home){
		this.age=age;
		this.name=name;
		this.home3=home;
		PrintStream err=System.err;
		err.println("构造方法");
	}
	
	public void print(){
		PrintStream err=System.err;
		err.println(this.age+"--"+this.name+"--"+this.home3);
	}
}
