package com.cgpluralsight.samples;

import java.time.Duration;
import java.time.Period;
import java.util.HashSet;
import java.util.Set;

public class DayNDuration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String d = Duration.ofDays(1).toString();
		String p = Period.ofDays(1).toString();
		boolean b1 = d == p;
		boolean b2 = d.equals(p);
		System.out.println(p);
		System.out.println(d);
		
		System.out.println(b1 + " " + b2);
		//Set<? extends RuntimeException> set = new HashSet<? extends RuntimeException>();
		
	}

}
