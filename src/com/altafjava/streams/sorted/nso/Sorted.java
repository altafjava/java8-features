package com.altafjava.streams.sorted.nso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//Natural Sorting Order
public class Sorted {

	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>();
		integers.add(10);
		integers.add(1);
		integers.add(20);
		integers.add(13);
		integers.add(0);
		integers.add(7);
		System.out.println("integers= " + integers);
		// without streams default natural sorting order
		Collections.sort(integers);
		System.out.println("using TreeSet= " + integers);

		// with streams
		List<Integer> list = integers.stream().sorted().collect(Collectors.toList());
		System.out.println("using streams= " + list);
	}
}
