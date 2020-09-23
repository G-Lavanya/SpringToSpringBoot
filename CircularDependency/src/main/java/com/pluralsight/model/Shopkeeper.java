package com.pluralsight.model;

import org.springframework.stereotype.Component;

@Component
public class Shopkeeper {
	private Customer cust;

	public Shopkeeper(Customer cust) {
		super();
		this.cust = cust;
	}

	

}
