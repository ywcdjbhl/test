package com.you.bean;

public class Key {
	private String id;
	private Lock other;
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return this.id;
	}
	public void setOther(Lock other){
		this.other=other;
	}
	public Lock getOther(){
		return this.other;
	}
}
