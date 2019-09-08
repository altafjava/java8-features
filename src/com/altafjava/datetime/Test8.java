package com.altafjava.datetime;

import java.time.LocalDate;
import java.time.Period;

//Period object can be used to find the duration between two dates
public class Test8 {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		LocalDate birthDate = LocalDate.of(1992, 03, 15);
		Period p = Period.between(birthDate, currentDate);
		System.out.printf("age is %d year %d months %d days", p.getYears(), p.getMonths(), p.getDays());
	}

}
