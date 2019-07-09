package com.you.bean;
import java.util.List;
public class Boy {
	private String id;
	private String name;
	private List girls;
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
	public void setGirls(List girls){
		this.girls=girls;
	}
	public List getGirls(){
		return this.girls;
	}
	
	
}
