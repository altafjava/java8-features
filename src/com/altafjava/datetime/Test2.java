package com.altafjava.datetime;

import java.time.LocalDateTime;

public class Test2 {

//	If we want to represent both Date and Time then we should go for LocalDateTime object
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime= " + localDateTime);

		int dd = localDateTime.getDayOfMonth();
		int mm = localDateTime.getMonthValue();
		int yyyy = localDateTime.getYear();
		System.out.printf("dd-MM-yyyy= %d-%d-%d", dd, mm, yyyy);

		int h = localDateTime.getHour();
		int m = localDateTime.getMinute();
		int s = localDateTime.getSecond();
		int n = localDateTime.getNano();
		System.out.printf("\nhh:mm:ss:nn= %d:%d:%d:%d", h, m, s, n);
	}

}
