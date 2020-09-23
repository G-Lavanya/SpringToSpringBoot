package com.cg.jpawithsql;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn( name = "Designation" )

public class Employee implements Serializable{
	@Id
	protected int empID;
	private String empName;
	
	public Employee(int empID, String empName) {
		super();
		this.empID = empID;
		this.empName = empName;
		
	}

	public Employee() {
		super();
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName +  "]";
	}

	
}
