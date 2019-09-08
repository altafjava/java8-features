package com.altafjava.streams;

import java.util.stream.Stream;

public class StreamOf {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(5, 25, 6, 4, -1, 2);
		stream.forEach(System.out::println);

		System.out.println();
		Double[] d = { 2.5, 5.9, 4.8, 56.1, 47.5, 6.2 };
		Stream<Double> doubleStream = Stream.of(d);
		doubleStream.forEach(System.out::println);
	}
}
