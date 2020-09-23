package com.cg.pluralsight.java8.newfeatures;

public class PersonGen {
String Name;
 int age ;
 String gender;
public PersonGen(String name, int age, String gender) {
	super();
	Name = name;
	this.age = age;
	this.gender = gender;
}

public String getName() {
	return Name;
}

public int getAge() {
	return age;
}
public String getGender() {
	return gender;
}

@Override
public String toString() {
	return "PersonGen [Name=" + Name + ", age=" + age + ", gender=" + gender + "]";
}
	
}
