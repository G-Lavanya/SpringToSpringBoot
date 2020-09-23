package com.cg.pluralsight.java8.newfeatures;

@FunctionalInterface
public interface FunctionInterfaceVsInheritance {
	//SAM:- single abstract method
	  void m1();
	  default void m2() {
		  
	  }
	  static void m3() {
		  
	  }
	  public default void m4() {
	}
	 // void m5();

}

@FunctionalInterface
interface InheritanceInterface extends  FunctionInterfaceVsInheritance{
	//1.overriding the parent abstract method cannot yield in any error 
	//2.but creating new abstract method leads to compilation error-> not a valid functional Interface
	
	//void m2();

}
