package com.cg.pluralsight.java8.newfeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntermediateFinalMethods {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("one", "Two", "Three", "Four");

		Predicate<String> ps1 = Predicate.isEqual("Two");

		Predicate<String> ps2 = Predicate.isEqual("Three");

		List<String> list = new ArrayList<>();

		stream.peek(System.out::println) // peek is an intermediate operation which has to be ended//
				//.filter(ps1.and(ps2))
				//.forEach(s->list.add(s));
				.forEach(list::add);
				//.close() // close method acts as final method so it provides the output//
		System.out.println("done");
		System.out.println("the size is "+list.size());

	}

}
/*
 * Consumers- takes object doesn't returns; Predicate - takes object as
 * parameter and returns boolean ; LAZY - intermediate operations ;
 * foreach-Consumer(not lazy)
 * 
 * peek - Consumer(lazy) filter- Predicate(lazy)
 */