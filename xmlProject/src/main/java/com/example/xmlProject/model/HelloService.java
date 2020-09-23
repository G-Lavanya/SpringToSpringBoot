package com.example.xmlProject.model;

public class HelloService {
	private String office;
	private String city;
	public HelloService(String office, String city) {
		super();
		this.office = office;
		this.city = city;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "HelloService [office=" + office + ", city=" + city + "]";
	}
	
	
	
	

}
