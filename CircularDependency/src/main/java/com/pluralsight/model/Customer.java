package com.pluralsight.model;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Customer { 
	//customer is created first and then goes to shopkeeper

	private Shopkeeper shop;
	
	public Customer(@Lazy Shopkeeper shop) {
		this.shop = shop;

	}

	public void Dosomething() {
		System.out.println("helloo");
	}

}
