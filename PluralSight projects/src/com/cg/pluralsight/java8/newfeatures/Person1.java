package com.cg.pluralsight.java8.newfeatures;

import java.time.LocalDate;

public class Person1 {
	private String name;
	private  LocalDate dateOfBirth;
	public Person1(String name, LocalDate dateOfBirth) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}
	public String getName() {
		return name;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	@Override
	public String toString() {
		return "Person1 [name=" + name + ", dateOfBirth=" + dateOfBirth + "]";
	}
	

}
