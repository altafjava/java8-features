package com.altafjava.predefinedfunctions;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		Function<String, Integer> function=s->s.length();
		System.out.println("length of Altaf= "+function.apply("Altaf"));
		System.out.println("length of AltafJava= "+function.apply("AltafJava"));
	}
}
