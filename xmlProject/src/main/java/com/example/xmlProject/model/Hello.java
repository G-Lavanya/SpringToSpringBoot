package com.example.xmlProject.model;

public class Hello implements HelloInterface {

	private String name;
	private Department dept;

	public Hello() {

	}
	public Hello(Department dept) {

		this.dept = dept;
	}
	public Hello(String name, Department dept) {
		super();
		this.name = name;
		this.dept = dept;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HelloService PrintHello(String city) {
		System.out.println("Hello" + name);
		return new HelloService(name, city);
	}

	public void showHelloDetails() {
		System.out.println("Employee Id : " + name);
		System.out.println("Employee Name : " + dept.getDeptName());
		System.out.println("Department : " + dept.getManager());
	}

}
