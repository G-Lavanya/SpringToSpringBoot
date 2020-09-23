package com.cg.pluralsight.java8.newfeatures;

import java.io.File;
import java.io.FileFilter;

public class LambdaExpressionsClass {

	// n->n*n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileFilter filter = new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".pdf");
			}
		};
		//Lambda Expression
		
		FileFilter filterLambda = (File pathname) -> pathname.getName().endsWith(".pdf");

		File file = new File("f:/books");
		File[] files = file.listFiles(filter);
		for (File f : files) {
			System.out.println(f);
		}

	}

}
