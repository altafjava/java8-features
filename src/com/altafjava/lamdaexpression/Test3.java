package com.altafjava.lamdaexpression;

public class Test3 {

	// normal method
	public int getLength(String s) {
		return s.length();
	}

	interface Interf {
		int m1(String s);
	}

	public static void main(String[] args) {
		Test3 test = new Test3();
		String name = "AltafJava";
		int length = test.getLength(name);
		System.out.println("length of " + name + " using normal method = " + length);

		// using lamda expression
		Interf i = (String s) -> {
			return s.length();
		};
		int l = i.m1(name);
		System.out.println("length of " + name + " using lamda expression = " + l);

		/*
		 * Note: Based on the context compiler can guess the return type. Hence no need to write return keyword
		 */
		Interf i2 = (String s) -> s.length();
		int l2 = i2.m1(name);
		System.out.println("length of " + name + " using lamda expression = " + l2);

		/*
		 * Note: Based on the context compiler can guess the parameter type also . Hence parameter data type is optional
		 */
		Interf i3 = (s) -> s.length();
		int l3 = i3.m1(name);
		System.out.println("length of " + name + " using lamda expression = " + l3);

		/*
		 * Note: If there is only one parameter then parentheses () is optional
		 */
		Interf i4 = s -> s.length();
		int l4 = i4.m1(name);
		System.out.println("length of " + name + " using lamda expression = " + l4);
	}
}
