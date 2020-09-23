package com.cg.pluralsight.java8.newfeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class MapFlatMap {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 1, 3, 4, 5, 7);
		List<Integer> list2 = Arrays.asList(7, 7, 4);
		List<Integer> list3 = Arrays.asList(7, 1, 9);

		List<List<Integer>> list = Arrays.asList(list1, list2, list3);
		System.out.println(list);
		
		Function<List<?>, Integer> size = List::size;                 //l->l.size();
		Function<List<Integer>, Stream<Integer>> flatMapper = l->l.stream();
		
		
		//after this try creating function interface line 16
		list.stream()
					.flatMap(flatMapper) 
		//.map(flatMapper) //output:String values      
		//.map(size) Output:6 3 3 	
		//.map(l -> l.size()) //output:6 3 3 
					.forEach(System.out::println);
	}

}
