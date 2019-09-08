package com.altafjava.predefinedfunctions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/*Write a lamda expression to check whether a collection is empty or not*/
public class PredicateTest2 {

	public static void main(String[] args) {
		// Predicate using lamda expression with concise code
		Predicate<Collection<Integer>> predicate = c -> c.isEmpty();
		List<Integer> list = new ArrayList<>();
		System.out.println(predicate.test(list));
		list.add(10);
		System.out.println(predicate.test(list));
	}
}
