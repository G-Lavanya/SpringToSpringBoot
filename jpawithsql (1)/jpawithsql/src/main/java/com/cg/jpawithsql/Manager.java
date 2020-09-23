package com.cg.jpawithsql;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@DiscriminatorValue(value = "Manager")
public class Manager extends Employee {
	@Column
	private String ProjectName;

	public Manager() {
		super();
	}

	public String getProjectName() {
		return ProjectName;
	}

	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}

	@Override
	public String toString() {
		return "Manager [empID="+empID+" ,ProjectName=" + ProjectName + "]";
	}

}
