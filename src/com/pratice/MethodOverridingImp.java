package com.pratice;

public class MethodOverridingImp extends MethodOverRiding {
	
	public void prati() {
		System.out.println("Childnn Class");
	}
	
public static void main(String[] args) {
	
	
	MethodOverRiding m = new MethodOverRiding();
		m.prati();
		
		MethodOverRiding m1 = new MethodOverridingImp();   // upcasting
		m1.prati();
		
	}

}
