package com.cg.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class ShipwreckRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	{
		System.out.println("entityManager"+ entityManager);
	}
	
	public String m1() {
		
		System.out.println("entityManager"+ entityManager);
		return null;
		
	}
	
}
