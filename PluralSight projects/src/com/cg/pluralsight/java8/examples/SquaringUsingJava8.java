package com.cg.pluralsight.java8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SquaringUsingJava8 {

	public static void main(String[] args) {
		//****************Using list***************//
		List<Integer> l = Arrays.asList(1, 2, 3, 4);
		List<Integer> l1 = l.stream().map(n -> n * n).collect(Collectors.toList()); // distinct is stateful operation(it
																					// retains state of the element from
																					// previous state)
		System.out.println(l1);
		
		
		//****************Using Streams***************//
		Stream<Integer> s = Stream.of(1, 2, 3, 4);
		Consumer<Integer> c = n -> System.out.println(n * n);
		s.forEach(c);
		// l.stream().close();
	}

}
