package com.altafjava.streams;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>();
		integers.add(10);
		integers.add(3);
		integers.add(20);
		integers.add(13);
		integers.add(0);
		integers.add(7);
		System.out.println("integers= " + integers);
		// Without Streams
		System.out.print("foreach using loop= ");
		for (Integer integer : integers) {
			System.out.print(integer + " ");
		}

		// With Streams
		System.out.print("\nforeach using streams= ");
		integers.stream().forEach(i -> System.out.print(i + " "));

		System.out.println("\nforeach using streams(Method reference)= ");
		integers.stream().forEach(System.out::println);

	}
}
