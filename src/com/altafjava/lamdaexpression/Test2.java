package com.altafjava.lamdaexpression;

public class Test2 {

	// normal method
	public void printSum(int a, int b) {
		System.out.println("sum using normal method= " + (a + b));
	}

	interface Interf {
		void m2(int a, int b);
	}

	public static void main(String[] args) {
		Test2 test = new Test2();
		test.printSum(10, 20);

		// using lamda expression

		Interf i = (int a, int b) -> System.out.println("using lamda expression sum= " + (a + b));
		i.m2(10, 20);

		/*
		 * Note: Based on the context compiler can guess the data type. Hence data type
		 * is optional. This is call Type Inference
		 */
		Interf interf = (a, b) -> System.out.println("using lamda expression sum= " + (a + b));
		interf.m2(10, 20);

	}
}
