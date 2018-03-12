package com.pratice;
import java.util.*;
import java.io.*;

public class String {

	
	public static void main(java.lang.String[] args) {
		
		java.lang.String s1= "Zendaya, BLAKE Lively and Emily Blunt couldn't "
				+ "contain their admiration for designer Michael Kors during the Michael"
				+ " Kors Collection show held at the Vivian Beaumont Theatre at Lincoln Center";
		java.lang.String s2 = "Vamshi&Krishna";
	 
		java.lang.String[] arrOfString = s2.split("&",6);
		
		System.out.println("Length of String = " + s1.length());
		System.out.println("Lower Case = "+s1.toLowerCase());
		System.out.println("Upper Case = "+s1.toUpperCase());
		System.out.println("Index of = "+s1.indexOf("the"));
		System.out.println("Replace of =  "+s1.replace("Emily", "Michel"));
		System.out.println("Empty = "+s1.isEmpty());
		System.out.println("Subsequence = "+s1.subSequence(0, 30));
		System.out.println("Char at ="+s1.charAt(4));
		
		for (java.lang.String a : arrOfString)
			System.out.println(a);
		
		

		
		// TODO Auto-generated method stub

	}

	private String[] split(java.lang.String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
