package com.example.xmlProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.xmlProject.model.Hello;
import com.example.xmlProject.model.HelloInterface;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appcontext = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	
    	Hello h = appcontext.getBean("hello",Hello.class);
    	h.setName("pop");
    	//h.setDept(dept);
    	h.showHelloDetails();
    	System.out.println(h.PrintHello("Hyd"));
    	
    	
    }
}
