package com.cgpluralsight.samples;

import java.time.LocalDate;
import java.util.Optional;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Streamexample {
	private static void magic(Stream<Integer> s) {
		Optional o = s.filter(x -> x < 5).limit(3).max((x, y) -> (x-y));
		System.out.println(o.get());
		}
	public static void main(String[] args) {
		//magic(Stream.empty()); //no such element
		//magic(Stream.iterate(1, x ->(> x++))); //syntax error
		//magic(Stream.of(5, 10)); //no value present exception
		
		  Stream<LocalDate> s = Stream.of(LocalDate.now()); 
		  UnaryOperator<LocalDate> u
		  = l -> l; s.filter(l -> l != null).map(u).peek(System.out::println);
		  
		 
	}
}
		/* public interface CanWalk {
			 default void walk() { System.out.println("Walking"); }
			 }
			 public interface CanRun {
			 public default void walk() { System.out.println("Walking"); }
			  public abstract void run();
			  }
			  public interface CanSprint extends CanWalk, CanRun {
			 void sprint();
			 }}
*/

