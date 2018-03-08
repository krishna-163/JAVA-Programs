package com.pratice;

public class Constructor {

	public Constructor() {
		System.out.println("Null");
	}
	
	public Constructor(int x) {
		System.out.println("6");
	}
	
	public Constructor(String K) {
		System.out.println("Krish");
	}
	
	public Constructor(int y, String J) {
		System.out.println("7" + "David");
	}
	
	
	public static void main(String[] args) {
		Constructor c = new Constructor();
		Constructor d = new Constructor(5);
		Constructor e = new Constructor("john");
		Constructor f = new Constructor("5" + "Wareen");
		

	}

}
