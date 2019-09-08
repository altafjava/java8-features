package com.altafjava.streams;

import java.util.ArrayList;
import java.util.List;

public class ToArray {

	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>();
		integers.add(10);
		integers.add(1);
		integers.add(20);
		integers.add(16);
		integers.add(0);
		integers.add(7);
		System.out.println("integers= " + integers);
		// Without Streams
		Integer[] arr = new Integer[integers.size()];
		integers.toArray(arr);
		System.out.print("toArray() without streams= ");
		for (int i : arr) {
			System.out.print(i + " ");
		}

		// With Streams
		System.out.print("\ntoArray() with streams= ");
		Integer[] bbb = integers.stream().toArray(Integer[]::new);
		for (int i : bbb) {
			System.out.print(i + " ");
		}
	}
}
