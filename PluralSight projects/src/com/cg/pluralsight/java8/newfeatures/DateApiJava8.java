package com.cg.pluralsight.java8.newfeatures;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DateApiJava8 {

	public static void main(String[] args) {
		List<Person1> persons = new ArrayList<>();
		try (

				BufferedReader reader = new BufferedReader(
						new InputStreamReader(DateApiJava8.class.getResourceAsStream("person1")));
				Stream<String> stream = reader.lines();
		// System.out.println(stream);
		) {
			stream.map(line -> {
				String[] s = line.split(" ");
				 String name = s[0].trim();
				 int year = Integer.parseInt(s[1]);
				 Month month = Month.of(Integer.parseInt(s[2]));
				 int day = Integer.parseInt(s[3]);
				Person1 p = new Person1(s[0].trim(), LocalDate.of(year, month, day));
				persons.add(p);
				return p;
			}).forEach(System.out::println);
		} catch (IOException e) {
			System.out.println(e);
		}
		LocalDate date = LocalDate.now();
		System.out.println(date);
		persons.stream().forEach( p->{ Period period  = Period.between(p.getDateOfBirth(), date);
				System.out.println(p.getName() +" was born "+period.get(ChronoUnit.YEARS)+" years "
						+period.get(ChronoUnit.MONTHS)+ " months "+period.get(ChronoUnit.DAYS)+" days "
						+ p.getDateOfBirth().until(date,ChronoUnit.MONTHS)+ " months");
		});
		
	}

}
