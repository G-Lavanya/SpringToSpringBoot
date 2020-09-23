package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Address;

@Component("AddressRepository")
//@Repository("AddressRepository")
public class HibernateAddressRepositoryImpl implements AddressRepository {

	
	
	@Override
	public List<Address> Address() {
		List<Address> address = new ArrayList<>();
		Address addre = new Address();
		
		addre.setState("Hyderabad");
		addre.setCountry("India");
		address.add(addre);
		System.out.println("Hi I am address");
		return address;
		
	}

}
