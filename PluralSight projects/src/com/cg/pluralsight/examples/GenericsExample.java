package com.cg.pluralsight.examples;

import java.awt.List;
import java.util.ArrayList;

public class GenericsExample {
	public static void main(String[] args) {
		
	
	
	ArrayList l = new ArrayList(); //non generic code
	//no operations are alowed for refernce variable l
	
	ArrayList<Integer> list = new ArrayList<Integer>(); //non generic code
	list.add(299);
	//list.add("lavanya");
	
	}

}
