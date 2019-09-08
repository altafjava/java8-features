package com.altafjava.methodreference;

interface Interf {
	void m1();

//	void m3(); Must be a functional interface if we are using Method reference
}

public class StaticMethod {

	public static void m2() {
		System.out.println("m2 method called");
	}

	public static void main(String[] args) {
		// using lamda expression
		Interf i = () -> {
			System.out.println("m1 implementation");
		};
		i.m1();

		// using method reference
		Interf i2 = StaticMethod::m2;
		i2.m1();
	}

	/*
	 * Note: Hence we can replace lamda expression with method refernce. Method
	 * reference is an alternative of lamda expression. If we are using method
	 * reference then both method refree & method refferal must have same signature
	 */
}
