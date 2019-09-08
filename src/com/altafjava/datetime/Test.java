package com.altafjava.datetime;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test {

//	Display System Date and time
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println("localDate= " + localDate);
		int dd = localDate.getDayOfMonth();
		int mm = localDate.getMonthValue();
		int yyyy = localDate.getYear();
		System.out.printf("dd-MM-yyyy= %d-%d-%d", dd, mm, yyyy);

		LocalTime localTime = LocalTime.now();
		System.out.println("\nlocalTime= " + localTime);
		int h = localTime.getHour();
		int m = localTime.getMinute();
		int s = localTime.getSecond();
		int n = localTime.getNano();
		System.out.printf("hh:mm:ss:nn= %d:%d:%d:%d", h, m, s, n);
	}

}
