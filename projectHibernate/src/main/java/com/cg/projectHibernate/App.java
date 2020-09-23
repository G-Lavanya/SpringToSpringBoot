package com.cg.projectHibernate;

import java.util.Arrays;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {

		Product p3 = new Product();
		Product p1 = new Product();

		p1.setProductId(107);
		p1.setProductName("Boat");

		Product p2 = new Product();
		p2.setProductId(110);
		p2.setProductName("JBL");
		p3.setProductId(112);
		p3.setProductName("Philips");

		Orders order = new Orders();

		order.setOrderId(1001);
		order.setProductList(Arrays.asList(p1, p2, p3));

		Orders o2 = new Orders();

		o2.setOrderId(1002);
		o2.setProductList(Arrays.asList(p1, p2));

		p1.setOrderList(Arrays.asList(order, o2));

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Lavanya");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		// em.remove(emp2);
		em.persist(p3);
		em.persist(p1);
		em.persist(p2);
		em.persist(order);
		em.getTransaction().commit();
		System.out.println(p1);
		System.out.println(order);

	}
}
