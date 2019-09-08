package com.altafjava.datetime;

import java.time.LocalDateTime;
import java.time.Month;

public class Test3 {

//	We can represent a particular Date and Time by using LocalDateTime object as follows.
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.of(1990, Month.AUGUST, 05, 10, 48, 56);
		System.out.println("localDateTime= " + localDateTime);

		System.out.println("After 6 months= " + localDateTime.plusMonths(6));
		System.out.println("Before 6 months= " + localDateTime.minusMonths(6));
	}

}
