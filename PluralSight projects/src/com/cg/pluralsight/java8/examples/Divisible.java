package com.cg.pluralsight.java8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Divisible {

	public static void main(String[] args) {

		List <Integer> list = Arrays.asList(1,2,3,4,5);
		List <Integer> list1 = list.stream().map(n->n*n).filter(n->n%3 ==0).collect(Collectors.toList());
			System.out.println(list1);
	}

}
