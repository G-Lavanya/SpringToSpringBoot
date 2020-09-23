package com.cg.pluralsight.examples;

public class InputmatchException extends Exception {
	public InputmatchException() {
		// TODO Auto-generated constructor stub
		super();
	}

	public InputmatchException(ExceptionClass ec) {
		// TODO Auto-generated constructor stub
	//this();
		System.out.println("hello error");
	}

	public InputmatchException(String b) {
		// TODO Auto-generated constructor stub
		super(b);
	}

}
