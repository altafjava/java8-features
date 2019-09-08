package com.altafjava.streams;

import java.util.ArrayList;
import java.util.List;

public class Min {

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
		int min = Integer.MAX_VALUE;
		for (Integer integer : integers) {
			if (min > integer) {
				min = integer;
			}
		}
		System.out.println("without streams min= " + min);

		// With Streams
		min = integers.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("with streams min= " + min);
	}
}
