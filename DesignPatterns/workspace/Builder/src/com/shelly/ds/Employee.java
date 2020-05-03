package com.shelly.ds;

public class Employee {
	private int id;
	private String name;
	private int age;
	
	private Employee(Builder builder) {
		id=builder.id;
		name= builder.name;
		age= builder.age;		
	}
	
		public static class Builder{
			
			private int id;
			private String name;
			private int age;
		
			//builder methods for setting property
		    public Builder(int id){
		    	this.id = id;
		    	
		     	}
		    public Builder name(String name){
		    	this.name = name;
		    	return this; 
		    	}
		    public Builder age(int age){
		    	this.age = age;
		    	return this; 
		    	}
		  //return fully build object
		    public Employee build() {
		        return new Employee(this);
		    }
		}
		
		@Override
		public String toString() {
			return "Employee id::"+ this.id+" name ::"+name+" age:: "+age;
		}
		public static void main (String...args) {
			
			Employee emp = new Employee.Builder(1).age(30).name("Shelly").build();
			
			System.out.println("Emp=>"+emp);
		}
}