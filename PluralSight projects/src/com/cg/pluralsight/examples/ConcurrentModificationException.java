package com.cg.pluralsight.examples;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationException {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main Thread started");
		List<String> ls = new ArrayList<>();
		ls.add("apple");
		ls.add("pineapple");
		MyThread t = new MyThread(ls);
		new Thread(t).start();
		//System.out.println(ls);
//		for (Enumeration<String> e =; e.hasMoreElements();) //iterator(1.8) is used in replacement of enumeration(1.0) with addition methods in it
//		       System.out.println(e.nextElement());
		Iterator<String> it = ls.iterator();
		while(it.hasNext()) {
			System.out.println("list: "+it.next()); //generally iterator follows the the single 
													//thread operations on an object but here we have changed the list by
													//changing the value  creating another thread and changed the value doessn't
													 // match with the iterator counter  it throws exception.
			
			
			
			Thread.currentThread().sleep(1000);
		}
		
		
	}

}
