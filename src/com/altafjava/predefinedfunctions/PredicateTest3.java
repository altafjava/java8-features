package com.altafjava.predefinedfunctions;

import java.util.function.Predicate;

public class PredicateTest3 {

	public static void main(String[] args) {
		Predicate<Integer> greaterThanTenPredicate = i -> i > 10;
		Predicate<Integer> evenNumberPredicate = i -> i % 2 == 0;
		int[] arr = { 2, 64, 1, 0, 7, 15, 36, 3, 25 };
		System.out.print("greaterThanTenPredicate= ");
		printArray(greaterThanTenPredicate, arr);
		System.out.print("Not Greater Than 10= ");
		printArray(greaterThanTenPredicate.negate(), arr);
		System.out.print("evenNumberPredicate= ");
		printArray(evenNumberPredicate, arr);
		System.out.print("not even numbers= ");
		printArray(evenNumberPredicate.negate(), arr);
		System.out.print("greater than 10 && evenNumbers= ");
		printArray(greaterThanTenPredicate.and(evenNumberPredicate), arr);
		System.out.print("greater than 10 || evenNumbers= ");
		printArray(greaterThanTenPredicate.or(evenNumberPredicate), arr);

		Predicate<String> stringPredicate = Predicate.isEqual("AltafJava");
		System.out.println("AltafJava.equals(Altaf)= " + stringPredicate.test("Altaf"));
		System.out.println("AltafJava.equals(Altaf)= " + stringPredicate.test("AltafJava"));
	}

	public static void printArray(Predicate<Integer> predicate, int[] arr) {
		for (int i : arr) {
			if (predicate.test(i))
				System.out.print(i + " ");
		}
		System.out.println();
	}
}
