package com.cg.pluralsight.examples;

import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class navigableSetExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		NavigableSet<Integer> set = new TreeSet<>();
		for (int i = 1; i <= 20; i++)
			set.add(i);
		//s.nextLine();
		System.out.println(set.lower(10)); 
		System.out.println(set.floor(10)); 
		System.out.println(set.ceiling(20)); 
		System.out.println(set.higher(20));
	}

}
