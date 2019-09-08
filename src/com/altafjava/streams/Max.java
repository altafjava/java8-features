package com.altafjava.streams;

import java.util.ArrayList;
import java.util.List;

public class Max {

	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>();
		integers.add(10);
		integers.add(1);
		integers.add(20);
		integers.add(13);
		integers.add(17);
		integers.add(7);
		System.out.println("integers= " + integers);
		// Without Streams
		int max = Integer.MIN_VALUE;
		for (Integer integer : integers) {
			if (max < integer) {
				max = integer;
			}
		}
		System.out.println("without streams max= " + max);

		// With Streams
		max = integers.stream().min((i1, i2) -> i2.compareTo(i1)).get();
		System.out.println("with streams min= " + max);
	}
}
