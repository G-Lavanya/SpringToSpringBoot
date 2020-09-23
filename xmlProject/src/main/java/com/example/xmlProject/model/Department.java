package com.example.xmlProject.model;

public class Department {
	private String deptName;
	private String manager;
	
	
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String year) {
		this.manager = year;
	}
	public Department(String deptName, String manager) {
		super();
		this.deptName = deptName;
		this.manager = manager;
	}
	public Department() {
	}
	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", manager=" + manager + "]";
	}
	
	
	

}
