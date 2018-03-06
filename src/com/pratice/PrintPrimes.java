package com.pratice;

public class PrintPrimes {
	public void printPrimenumbers() {
		CheckPrime ch = new CheckPrime();
		for (int i = 3; i <= 150; i++) {
			boolean stas = ch.isPrime(i);
			System.out.println(i + " is " + stas);

		}

		/*
		 * 
		 * public class PrintPrimes { .. extend CheckPrime
		 * public void printPrimenumbers() {    .. insted of calling objest we can add 
		 *  CheckPrime ch = new CheckPrime();
		 *   for(int i=3; i<=150; i++) { 
		 *   boolean stas = ch.isPrime(i);
		 * System.out.println(i+" is "+ stas); *
		 */

	}

	public static void main(String[] args) {

		PrintPrimes p = new PrintPrimes();
		p.printPrimenumbers();
		// TODO Auto-generated method stub

	}

}
