package com.cg.pluralsight.examples;

public class dataHidingExample {
	
	public static void datahiding(){
		System.out.println("hello datahiding");
	}
	void data(){
		System.out.println("data here");
	}
	public static void main(String[] args) {
		datahiding();
	}
}
class datahide extends dataHidingExample{
	 @Override
	 void data() {
		 System.out.println("data in child class");
	 }
	 
	 public static void datahiding() {
		 System.out.println("datahiding in child class");
		 // this data has been hiding
	 }
	 
}
