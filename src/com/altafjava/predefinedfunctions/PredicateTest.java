package com.altafjava.predefinedfunctions;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		// Predicate using lamda expression with verbose code
		Predicate<Integer> predicate = i -> {
			if (i > 10)
				return true;
			else
				return false;
		};
		System.out.println(predicate.test(20));
		System.out.println(predicate.test(5));

		/*
		 * Note: When compiler encounter relational operator(>). It understands that it has to return either true/false. Hence no need to write return keyword. Simple
		 * write your condition without if-else
		 */
		// Predicate using lamda expression with concise code
		Predicate<Integer> predicate2 = i -> (i > 10);
		System.out.println(predicate2.test(20));
		System.out.println(predicate2.test(5));
	}
}
