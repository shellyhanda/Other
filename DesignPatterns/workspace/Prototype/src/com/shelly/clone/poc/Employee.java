package com.shelly.clone.poc;

public class Employee implements Cloneable{
	
	private String employeeId;
	private String empName;
	private Department dep;
	
	
	public Employee(String employeeId, String empName, Department dep) {
		this.employeeId = employeeId;
		this.empName = empName;
		this.dep = dep;
	}
 
	protected Employee clone() throws CloneNotSupportedException {
		Employee empCloned= (Employee)super.clone();//Shallow cloning
		if(empCloned.getDep() instanceof Cloneable) {
			empCloned.setDep(empCloned.getDep().clone());//deep cloning
		}
		
		return empCloned;
	}
	
	public Department getDep() {
		return dep;
	}
	public void setDep(Department dep) {
		this.dep = dep;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	
	

}
