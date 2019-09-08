package com.altafjava.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>();
		integers.add(10);
		integers.add(1);
		integers.add(20);
		integers.add(13);
		integers.add(17);
		integers.add(16);
		integers.add(0);
		integers.add(7);
		System.out.println("integers= " + integers);
		// Without Streams
		List<Integer> evenIntegers = new ArrayList<>();
		for (Integer integer : integers) {
			if (integer % 2 == 0) {
				evenIntegers.add(integer);
			}
		}
		System.out.println("evenIntegers= " + evenIntegers);

		// With Streams
		List<Integer> evenIntegersByUsingStreams = integers.stream().filter(i -> i % 2 == 0)
				.collect(Collectors.toList());

		System.out.println("evenIntegersByUsingStreams= " + evenIntegersByUsingStreams);
	}
}
