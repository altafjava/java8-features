package com.altafjava.methodreference;

public class InstanceMethod {

	public static void main(String[] args) {
		// using lamda expression
		Runnable runnable = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("child thread using lamda expression");
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();

		// using method reference
		InstanceMethod instanceMethod = new InstanceMethod();
		Runnable runnable2 = instanceMethod::m2;
		Thread thread2 = new Thread(runnable2);
		thread2.start();
		// main thread
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");
		}
	}

//	Runnable - public void run()
	public void m2() {
		for (int i = 0; i < 5; i++) {
			System.out.println("child thread using method reference");
		}
	}

	/*
	 * Note: Hence we can replace lamda expression with method refernce. Method
	 * reference is an alternative of lamda expression. If we are using method
	 * reference then both method refree & method refferal must have same signature
	 */
}
