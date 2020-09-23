package com.cgpluralsight.samples;

//public interface Canwalkk {
	public interface CanWalk {
		 default void walk() { System.out.println("Walking"); }
		//}
	//	 public interface CanRun {
		 //public default void walk() { System.out.println("Walking"); }
		// public abstract void run();
		//}
		// public interface CanSprint extends CanWalk, CanRun {
		 void sprint();
		 }



