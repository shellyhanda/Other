package com.shelly.clone.poc;

public class CloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Department dep = new Department("1", "HR");
		Employee empOrignal= new Employee("1", "Shelly", dep);
		
		Employee empCloned= empOrignal.clone();
		empCloned.setEmpName("newName");
		empCloned.getDep().setName("Admin");
		
		System.out.println("empOrignal->"+empOrignal.getDep().getName());
		System.out.println("empOrignal->"+empOrignal.getEmpName());
		System.out.println("empCloned->"+empCloned.getDep().getName());
		System.out.println("empCloned->"+empCloned.getEmpName());
	}

}
