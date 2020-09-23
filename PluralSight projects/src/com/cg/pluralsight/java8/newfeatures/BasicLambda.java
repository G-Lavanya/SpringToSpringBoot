package com.cg.pluralsight.java8.newfeatures;

interface interf {
	public void m1();
	// public int add(int a, int b);

	default void m1(int k, int q) {
		System.out.println("Default method" + (k + q));
	}

	static void m2() {
		System.out.println("Static method");
	}
}

/*
class Demo implements interf {
	public void m1() {
		System.out.println("M1 implementation");
	}
} */

public class BasicLambda {

	public static void main(String[] args) {
		//interf i = new Demo();
		//i.m1();

		 interf i = ()->System.out.println("M1 implementation");
	}

}
