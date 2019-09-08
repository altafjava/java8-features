package com.altafjava.predefinedfunctions;

import java.util.function.Function;

public class FunctionTest2 {

	public static void main(String[] args) {
		Function<Integer, Integer> function = i -> i * i;
		System.out.println("square of 6= " + function.apply(6));
		System.out.println("square of 8= " + function.apply(8));
	}
}
