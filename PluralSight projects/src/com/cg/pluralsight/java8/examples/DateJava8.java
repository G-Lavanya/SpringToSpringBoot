package com.cg.pluralsight.java8.examples;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.Scanner;

public class DateJava8 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		Month m;
		Year y;
		int month = 1;
		int year = 1990;
		Scanner s = new Scanner(System.in);
		if(month>12 && year<2020) {
			System.out.println("invalid");
		}
		else {
			//System.out.println(m);
		}
		
	}

}
