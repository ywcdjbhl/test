package com.you.bean;
import java.util.List;
public class Girl {
	private String id;
	private String name;
	private List boys;
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return this.id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setBoys(List boys){
		this.boys=boys;
	}
	public List getBoys(){
		return this.boys;
	}
	
	
}
