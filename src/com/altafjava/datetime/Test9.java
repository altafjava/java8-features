package com.altafjava.datetime;

import java.time.Year;

//program to check the given year is leap year or not
public class Test9 {

	public static void main(String[] args) {
		int y = 2019;
		Year year = Year.of(y);
		if (year.isLeap())
			System.out.printf("%d is leap year", y);
		else
			System.out.printf("%d is not leap year", y);
	}

}
