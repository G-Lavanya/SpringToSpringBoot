package com.cg.pluralsight.java8.newfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionOptionals {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10);
		
		
		//Optional<Integer> i =list.stream().reduce(Integer::max);//Integer::sum);//(l1,l2)->(l1+l2));
		
		Integer i =list.stream().reduce(100, Integer::max);//Integer::sum);//(l1,l2)->(l1+l2));
		// the problem here is :it gives the value of identity: if the arraylist doesn't contain any value or the values gives are equal 
		// it also gives the greater value,when there is only single element, where comparison occurs at identity and element present in the arraylist 
		System.out.println(i);
	}

}
