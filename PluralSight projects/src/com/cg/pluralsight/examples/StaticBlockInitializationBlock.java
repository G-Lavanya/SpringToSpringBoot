package com.cg.pluralsight.examples;

public class StaticBlockInitializationBlock {

	static int staticVariable;
	int nonStaticVariable;

	// Static initialization block:
	// Runs once (when the class is initialized)
	static {
		System.out.println("Static initalization.");
		staticVariable = 5;
	}

	// Instance initialization block:
	// Runs each time you instantiate an object
	{
		System.out.println("Instance initialization.");
		nonStaticVariable = 7;
	}

	public StaticBlockInitializationBlock() {
		System.out.println("Constructor.");
	}

	public static void main(String[] args) {
		new StaticBlockInitializationBlock();
		new StaticBlockInitializationBlock();
	}
}
