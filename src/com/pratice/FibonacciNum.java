package com.pratice;
import java.util.Scanner;

public class FibonacciNum {
	public void printFibonacci() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of F_nums need to be printed");
		int i,n1,n2,n3,x;
		x = sc.nextInt();
		n1 =1;
		n2 = 1;
		System.out.print(n1+" "+n2 );
		
for(i=3; i<=x; i++) {
	
	n3=n1+n2;
	if (n3<=x) {
	n1=n2;
	n2=n3;
	System.out.print(" "+n3 );
}
	else break;
}

	
	}

	public static void main(String[] args) {
		FibonacciNum fs = new  FibonacciNum();
		fs.printFibonacci();

	}

}
