package com.altafjava.aic;

interface Interface {
	void m1();
}

public class LamdaExpressionEffectiveFinal {
	int x = 10;

	public void test() {
		int y = 20;
		Interface inf = () -> {
			x = 30;
//			y = 40;// Local variable y defined in an enclosing scope must be final or effectively final
			System.out.println("x= " + x);
			System.out.println("y= " + y);
		};
		inf.m1();
	}

	public static void main(String[] args) {
		LamdaExpressionEffectiveFinal t = new LamdaExpressionEffectiveFinal();
		t.test();
	}

	/*
	 * Note: We cannot change local variable value which is inside anonymous inner class or lamda expression. It must be final or effectively final. Effectively final
	 * means if a variable is declared with some value and never goinf to change within its life cycle then it is called effectively final.
	 */
}
