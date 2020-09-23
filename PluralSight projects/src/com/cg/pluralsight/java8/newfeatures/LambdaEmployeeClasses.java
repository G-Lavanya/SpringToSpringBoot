package com.cg.pluralsight.java8.newfeatures;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
	int empNum;
	String empName;
	Employee(String empName, int empNum){
		this.empName = empName;
		this.empNum = empNum;
	}
	public String toString() {
		return empName +":"+empNum;
		
	}
}
public class LambdaEmployeeClasses {
public static void main(String[] args) {
	/*
	 * Employee e =new Employee("lav",100); System.out.println(e);
	 */
	ArrayList<Employee> emp =new ArrayList<Employee>();
	emp.add(new Employee("Vineela",300));
	emp.add(new Employee("Yuvasri",200));
	emp.add(new Employee("Lavanya",100));
	
	System.out.println(emp);
	Collections.sort(emp, (e1,e2)->(e1.empNum<e2.empNum)?-1:(e1.empNum>e2.empNum)?1:0);
	System.out.println(emp);
	
	Collections.sort(emp,(e1,e2)->(e1.empName.compareTo(e2.empName)));
	System.out.println(emp);
}
}
