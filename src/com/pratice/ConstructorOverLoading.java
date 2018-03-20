package com.pratice;

public class ConstructorOverLoading {

	public ConstructorOverLoading() {
		System.out.println("Null");
	}
	
	public ConstructorOverLoading(int x) {
		System.out.println(x);
	}
	
	public ConstructorOverLoading(String K) {
		System.out.println(K);
	}
	
	public ConstructorOverLoading(int y, String J) {
		System.out.println(y+""+J);
	}
	
	
	public static void main(String[] args) {
		
		ConstructorOverLoading c = new ConstructorOverLoading();
		ConstructorOverLoading d = new ConstructorOverLoading(5);
		ConstructorOverLoading e = new ConstructorOverLoading("john");
		ConstructorOverLoading f = new ConstructorOverLoading("5 " + "Wareen");
		
		

	}

}
