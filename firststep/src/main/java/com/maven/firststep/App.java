package com.maven.firststep;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		
		
		//Vehicle car = new Car();
		//
		
		
		//Getbean is method it is present in bean factory N apllicationContext and download the package required
		//bean factory is used for small application
		//application conte3xt is for enterprise application
		//application context is superset of bean Factory
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//appliation context will give the object of vehicle but it has to be class name its an interface and instance only created for class
		//define the objects in xml file,
		//whenever ask for vehicle it has to give the object using xml file
		Vehicle obj = (Vehicle)context.getBean("vehicle");
		
		obj.drive();
		
		
		
		
		
		System.out.println("Hello World!");
	}
}
