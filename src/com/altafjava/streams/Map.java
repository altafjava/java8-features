package com.altafjava.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

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
		List<Integer> doubledIntegers = new ArrayList<>();
		for (Integer integer : integers) {
			doubledIntegers.add(integer * 2);
		}
		System.out.println("doubledIntegers= " + doubledIntegers);

		// With Streams
		List<Integer> doubledIntegersByUsingStreams = integers.stream().map(i -> i * 2).collect(Collectors.toList());
		System.out.println("doubledIntegersByUsingStreams= " + doubledIntegersByUsingStreams);
		Integer[] ii=integers.stream().toArray(Integer[]::new);
	}
}
