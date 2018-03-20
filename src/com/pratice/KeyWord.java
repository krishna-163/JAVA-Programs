package com.pratice;

public class KeyWord {

	int i = 10;
	static int j = 20;

	public static void staticMethod() {

		System.out.println("Static Method");
		System.out.println("i can not be called Static j value is " + j);

	}

	public void instancemethod() {

		System.out.println("Instance Method");
		System.out.println("Instance variable i = " + i + " Static j value is " + j);

	}

	public static void main(String args[]) {
		staticMethod();
		KeyWord a1 = new KeyWord();
		a1.instancemethod();

		KeyWord m1 = new KeyWord();
		KeyWord m2 = new KeyWord();

		System.out.println(" i in m1 = " + m1.i);
		System.out.println(" j in m1 = " + m1.j);

		m1.i = 30;
		m1.j = 30;

		System.out.println(" i in m2 = " + m2.i);
		System.out.println(" j in m2 = " + m2.j);

		staticMethod();
		a1.instancemethod();
	}
}