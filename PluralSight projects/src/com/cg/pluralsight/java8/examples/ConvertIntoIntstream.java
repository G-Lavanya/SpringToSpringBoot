package com.cg.pluralsight.java8.examples;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertIntoIntstream {

	public static void main(String[] args) {

		int[] i = {2,5,5,6};
		IntStream stream = Arrays.stream(i);
	
		stream.forEach(n->System.out.print(n+", "));
		//System.out.println(stream);
		
	}

}
