package com.cg.pluralsight.java8.newfeatures;

interface inter {
	// public void m1();
//	public void add(int a, int b);
	public int add(int a, int b);

	default void m1(int k, int q) {
		System.out.println("Default method" + (k + q));
	}

	static void m2() {
		System.out.println("Static method");
	}
}

//Boiler plate code is replaced by the single line at line 18
/*
 * class Demo implements inter{ public void m1() {
 * System.out.println("M1 implementation"); } } with parameters public void
 * add(int a , int b){ System.out.println("the sum"+(a+b));
 * 
 */
public class FunctionalInterfaceImplementation {

	public static void main(String[] args) {
		// Demo d =new Demo();
		// parent reference to hold child object gives the sam output
		// inter i = new Demo();

		// inter i = () -> System.out.println("M1 implementation using lambda
		// Interface");
		// i.m1();
		// inter i = (a, b) -> System.out.println("The Sum =" + (a + b));
		inter i = (a, b) -> {
			return a + b;
		};
		System.out.println(i.add(12, 10));
		// i.add(12, 10);
		i.m1(89, 90);
		inter.m2(); // static method doesn't require reference type
		// here inter i is the reference to call the lambda expression.
		// in general functional interface acts as reference to call lambda expression

	}

}
