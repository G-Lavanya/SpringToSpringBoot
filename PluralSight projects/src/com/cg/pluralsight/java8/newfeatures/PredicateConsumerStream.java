package com.cg.pluralsight.java8.newfeatures;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateConsumerStream {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("one", "Two", "Three", "Four");
		Predicate<String> ps = s -> s.length() > 4; // predicate functional interface
		Predicate<String> ps1 = Predicate.isEqual("Two");
		Predicate<String> ps2 = Predicate.isEqual("Three");
		stream.filter(ps1.or(ps2)). // to filter the predicate
				forEach(s -> System.out.println(s)); // Consumer Functional Interface
	}

}
