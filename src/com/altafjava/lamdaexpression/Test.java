package com.altafjava.lamdaexpression;

public class Test {

	// normal method
	public void m1() {
		System.out.println("Normal method");
	}

	interface Interf {
		void m2();
	}

//	Note: we can use lamda expression in Functional Interfaces only
	public static void main(String[] args) {
		Test test = new Test();
		test.m1();

		// using lamda expression
		Interf interf = () -> {
			System.out.println("using lamda expression");
		};
		interf.m2();

		Interf i = () -> System.out.println("using lamda expression without curly brace");
		i.m2();

//		Note : If there is only one line then curly brace is optional
	}
}
