package com.pratice;

import java.util.Scanner;

public class FibboNum {
	public void printFibonacci_arg(int x) {
		int i, n1, n2, n3;
		n1 = 1;
		n2 = 1;
		System.out.print(n1 + " " + n2);

		for (i = 3; i <= x; i++) {

			n3 = n1 + n2;
			if (n3 <= x) {
				n1 = n2;
				n2 = n3;
				System.out.print(" " + n3);
			} else
				break;
		}

	}

	public static void main(String[] args) {
		FibboNum fs = new FibboNum();

		String value = args[0];
		int i = Integer.parseInt(value);

		fs.printFibonacci_arg(i);

	}

}
