package com.pratice;

public class MethodOverLoading {
	
	
	
	public static  int add(int a, int b) {
		return (a+b);
		
	}
	
	public static double add(double a, double b) {
		return (a+b);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(add(3,4));
System.out.println(add(3.5,5.6));
System.out.println(add(15,4.5));

	}

}
