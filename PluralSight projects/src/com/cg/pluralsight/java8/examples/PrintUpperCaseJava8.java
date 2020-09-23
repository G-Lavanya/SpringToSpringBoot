package com.cg.pluralsight.java8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintUpperCaseJava8 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java 8 ", "Lambdas ", "In ", "Action");
		List<String> l = list.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l);
	}

}
