package com.shelly.clone.poc;

public class Department implements Cloneable{
	
	private String id;
	private String name;
	
	
	@Override
	protected Department clone() throws CloneNotSupportedException {
		
		return (Department) super.clone();
	}
	public Department(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
