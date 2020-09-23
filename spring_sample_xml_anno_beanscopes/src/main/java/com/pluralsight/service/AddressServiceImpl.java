package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.pluralsight.repository.AddressRepository;
import com.pluralsight.model.Address;

@Service("AddressService")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

public class AddressServiceImpl implements AddressService {
	
	private AddressRepository addressRepo;
	
	@Autowired
	public void setCust(AddressRepository cust) {
		this.addressRepo = cust;
		System.out.println("hi setter here");
	}

	@Override
	public List<Address> Address() {
		// TODO Auto-generated method stub
		return addressRepo.Address();
	}


	

}
