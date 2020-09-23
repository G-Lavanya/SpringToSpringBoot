package com.pluralsight.model;

import org.springframework.stereotype.Component;

@Component
public class Address   {
	private String State;
	private String Country;

	
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	
	
}
