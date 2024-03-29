package com.altafjava.predefinedfunctions;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		Consumer<String> consumer = s -> System.out.println(s);
		consumer.accept("Altaf");
		consumer.accept("AltafJava");
	}
}
