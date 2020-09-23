package com.cg.pluralsight.java8.newfeatures;

public class LambdaExpressionsAnonymous { // LambdaExpression with Anonymous Inner Class(class without name)
	public static void main(String[] args) throws InterruptedException {
		/*
		 * Runnable runnable = new Runnable() {
		 * 
		 * @Override public void run() { // TODO Auto-generated method stub for(int i
		 * =0;i<=3;i++) {
		 * System.out.println("hello world"+Thread.currentThread().getPriority()); }
		 * 
		 * }
		 * 
		 * };
		 */
		Runnable runnable = () -> {
			for (int i = 0; i <= 3; i++) {
				System.out.println("hello world" + Thread.currentThread().getPriority());
			}
		};

		Thread n = new Thread(runnable);
		n.start();
		//n.join();

	}

}
