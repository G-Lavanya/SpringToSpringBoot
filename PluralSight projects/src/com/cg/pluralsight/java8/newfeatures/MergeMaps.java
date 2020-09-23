package com.cg.pluralsight.java8.newfeatures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeMaps {

	public static void main(String[] args) {

		List<PersonGen> person = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(MergeMaps.class.getResourceAsStream("PersonGenderAge")));
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
		//spliting the maps
	//	person.forEach(System.out::println);
		List<PersonGen> p1 = person.subList(0, 4); //gives out list of first first four
		List<PersonGen> p2 = person.subList(5, person.size()); //gives out elements after first 5 elements
		
		System.out.println(p2);
		//retriving the data by grouping with age
		Map<Integer, List<PersonGen>> map1 = mapByAge(p1);
		//System.out.println(map1);
		map1.forEach((age,list)->System.out.println(age+"->"+list));
		
		
		
		Map<Integer, List<PersonGen>> map2 = mapByAge(p2);
	//	System.out.println(map2);
		map2.forEach((age,list)->System.out.println(age+"->"+list));
		
		
		map2.entrySet().stream().forEach(entry->map1.merge(entry.getKey(), entry.getValue(), (l1,l2)->{l1.addAll(l2);
				return l1;}));
		
		
	}private static Map<Integer,List<PersonGen>> mapByAge(List<PersonGen> list){
		Map<Integer,List<PersonGen>> map = list.stream().collect(Collectors.groupingBy(PersonGen::getAge));
		//System.out.println(map);
		return map;
		}

}
