package com.altafjava.predefinedfunctions;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		Supplier<String> supplier = () -> "AltafJava";
		System.out.println(supplier.get() + "\n");
		
		Supplier<String> supplier2 = () -> {
			String[] arr = { "Altaf", "Sam", "Johar", "Karim", "Santosh" };
			int random = (int) (Math.random() * 4 + 1);
			return arr[random];
		};
		System.out.println(supplier2.get());
		System.out.println(supplier2.get());
		System.out.println(supplier2.get());
		System.out.println(supplier2.get());
	}
}
