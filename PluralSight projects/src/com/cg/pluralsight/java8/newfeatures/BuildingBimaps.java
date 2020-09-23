package com.cg.pluralsight.java8.newfeatures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BuildingBimaps {

	public static void main(String[] args) {
		List<PersonGen> person = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(BuildingBimaps.class.getResourceAsStream("PersonGenderAge")));
				Stream<String> stream = reader.lines();) {
			stream.map(line -> {
				String[] s = line.split(" ");
				PersonGen p = new PersonGen(s[0].trim(), Integer.parseInt(s[1]), s[2].trim());
				person.add(p);
				return p;
			}).forEach(System.out::println);
 
		} catch (IOException e) {
			System.out.println(e);
		
		}
		//person.forEach(System.out::println);
		Map<Integer,List<PersonGen>> map = person.stream().collect(Collectors.groupingBy(PersonGen::getAge));
		map.forEach((age,list)->System.out.println(age+"->"+list));
		
	}

}
