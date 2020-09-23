package com.cg.pluralsight.examples;

import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

public class MyThread implements Runnable{
	
	 List<String> p;
	 
	public MyThread(List<String> ls) {
		this.p = ls;
	}

	@Override
	public void run() {
		System.out.println("child class started");

		this.p.add("doll");
		System.out.println(p);
		System.out.println("child class ended ");
	}

}
