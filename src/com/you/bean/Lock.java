package com.you.bean;

import java.util.List;

public class Lock {
	private String id;
	private List keys;
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return this.id;
	}
	public void setKeys(List keys){
		this.keys=keys;
	}
	public List getKeys(){
		return this.keys;
	}
}
