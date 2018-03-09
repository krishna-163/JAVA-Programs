package com.pratice;

import java.util.Scanner;

public class Switch {
	public void switchUsage() {
		int x;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		x = sc.nextInt();

		switch (x) {
		case (90):
			System.out.println("Score is good");
			break;
		case 80:
			System.out.println("Score is ok");
			break;
		default:
			System.out.println("not listed");
		}

	}

	public static void main(String[] args) {
		Switch s = new Switch();
		s.switchUsage();
	}

}