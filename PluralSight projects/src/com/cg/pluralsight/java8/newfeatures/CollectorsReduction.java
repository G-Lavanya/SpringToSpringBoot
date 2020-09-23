package com.cg.pluralsight.java8.newfeatures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsReduction {
	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();
		try (

				BufferedReader reader = new BufferedReader(
						new InputStreamReader(CollectorsReduction.class.getResourceAsStream("person.txt")));
				Stream<String> stream = reader.lines();
		// System.out.println(stream);
		) {
			stream.map(line -> {
				String[] s = line.split(" ");
				Person p = new Person(s[0].trim(), Integer.parseInt(s[1]));
				persons.add(p);
				return p;
			}).forEach(System.out::println);
		} catch (IOException e) {
			System.out.println(e);
		}
		// Stream<Person> stream = persons.stream();
		Optional<Person> age =
				// stream.//filter(p->p.getAge()>22).
				persons.stream().min(Comparator.comparing(Person::getAge));

		System.out.println(age);
		Optional<Person> stream1 = persons.stream()
				.max(Comparator.comparing(Person::getAge));// stream has already been
																								// operated upon or
																								// closed

		System.out.println(stream1);
		Map<Integer, List<Person>> map = persons.stream()
				.collect(Collectors.groupingBy(Person::getAge)); 											// grouping by
																											// builds a
																											// map so
																											// use map
		System.out.println(map);// o/p:{21=[Person [name=Lavanya, age=21]], 22=[Person [name=Vineela, age=22]],
								// 23=[Person [name=yuvasri, age=23]], 24=[Person [name=harshini, age=24]]}

		Map<Integer, Long> map1 = persons.stream().collect(Collectors.groupingBy
				(Person::getAge,
						Collectors.counting())); 															// downStreamcollector
																											// using
																											// post
																											// processing
		System.out.println(map1);//o/p:{21=1, 22=1, 23=1, 24=1}
		
		Map<Integer, List<String>> map2 = persons.stream().collect(Collectors.groupingBy
				(Person::getAge,Collectors.mapping(Person::getName, 
						Collectors.toList()))); 															// downStreamcollector
																											// using
																											// post
																											// processing
		System.out.println(map2);//o/p:{21=[Lavanya], 22=[Vineela], 23=[yuvasri], 24=[harshini]}

		Map<Integer, Set<String>> map3 = persons.stream().collect(Collectors.groupingBy
				(Person::getAge,Collectors.mapping(Person::getName, 
						Collectors.toCollection(TreeSet::new))));											 // downStreamcollector
																											// using
																											// post
																											// processing
		System.out.println(map3);//o/p:{21=[Lavanya], 22=[Vineela], 23=[yuvasri], 24=[harshini]}
		
		Map<Integer, String> map4 = persons.stream().collect(Collectors.groupingBy
				(Person::getAge,Collectors.mapping(Person::getName, 
						Collectors.joining(", ")))); 														// downStreamcollector
																											// using
																											// post
																											// processing
		System.out.println(map4);//{21=Lavanya, 22=Vineela, 23=yuvasri, 24=harshini}


	}

}
