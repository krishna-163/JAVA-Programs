package com.pratice;

import java.util.Scanner;

public class Scann {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int x;
		x = sc.nextInt();
		System.out.println("Number is " + x);

		Scanner pc = new Scanner(System.in);
		System.out.println("Enter Word");
		String y;
		y = pc.nextLine();
		System.out.println("Word is " + y);
	}

}
