package com.cg.pluralsight.java8.newfeatures;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
/*class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return (o1<o2)?-1:(o1>o2)?1:0;
		
		 * if(o1<o2) { return -1; } else if(o1>o2) { return 1; } else { return 0; }
		 
	}
	
}*/

public abstract class LambdaExpressionCollection {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(12);
		arr.add(11);
		arr.add(14);
		arr.add(5);
		arr.add(0);
		arr.add(60);
		arr.add(0);
		System.out.println(arr);
		// Collections.sort(arr, new MyComparator());
		Comparator<Integer> c = (o1, o2) -> (o1 < o2) ? -1 : (o1 > o2) ? 1 : 0;
		//Collections.
		Collections.sort(arr, c);
		System.out.println(arr);
		
		
		/*arr.stream().forEach(System.out::println);
		List<Integer> l = arr.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(l);
*/
	}
}
