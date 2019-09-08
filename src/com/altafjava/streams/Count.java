package com.altafjava.streams;

import java.util.ArrayList;
import java.util.List;

public class Count {

	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>();
		integers.add(10);
		integers.add(1);
		integers.add(20);
		integers.add(13);
		integers.add(17);
		integers.add(16);
		integers.add(7);
		System.out.println("integers= " + integers);
		// Without Streams using loop
		int c1 = 0;
		for (Integer integer : integers) {
			c1++;
		}
		System.out.println("countIntegers using loop= " + c1);
		// Without Streams using collections method
		System.out.println("countIntegers using collection method = " + integers.size());

		// With Streams
		long count = integers.stream().count();
		System.out.println("countIntegers using stream = " + count);

		// With Streams with a condition
		count = integers.stream().filter(i -> i % 2 != 0).count();
		System.out.println("count of odd number using stream = " + count);
	}
}
