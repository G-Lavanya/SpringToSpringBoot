package com.cg.jpawithsql;

import javax.persistence.EntityManager;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.setProjectName("HSBC");
		m.setEmpID(4);
		m.setEmpName("Vineela");
		
		Fresher fresher = new Fresher();
		fresher.setTraining("Python");
		fresher.setEmpID(3);
		fresher.setEmpName("Jahnavi");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(m);
		em.persist(fresher);
		em.getTransaction().commit();
		System.out.println(fresher);
		System.out.println(m);

	}
}
