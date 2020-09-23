package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.Shipwreck;
import com.cg.repository.ShipwreckRepository;

@RestController
@RequestMapping("api/v1")
public class ShipwreckController {
	
	@Autowired
	private ShipwreckRepository repo;
	
	
	
	@RequestMapping(method = RequestMethod.GET, value = "shipwrecks")
	List<Shipwreck> list(){
		System.out.println("inside list() method call");
		repo.m1();
		return ShipwreckStub.list();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "shipwrecks")
	public Shipwreck create(@RequestBody Shipwreck shipwreck) {
		
		return ShipwreckStub.create(shipwreck);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "shipwrecks/{id}")
	public Shipwreck get(@PathVariable("id") long id){
		
		return ShipwreckStub.get(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
