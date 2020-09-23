package com.cg.pluralsight.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentModificationExceptionSolved {
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main Thread started");
	List<String> ls = new CopyOnWriteArrayList<>();
	ls.add("apple");
	ls.add("pineapple");
	MyThread t = new MyThread(ls);
	new Thread(t).start();
	Iterator<String> it = ls.iterator();
	while(it.hasNext()) {
		System.out.println("list: "+it.next()); //Exception occurs here
		Thread.currentThread().sleep(1000);
	}
	
}
}
