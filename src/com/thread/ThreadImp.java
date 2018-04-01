package com.thread;

public class ThreadImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadEx t1 = new ThreadEx();
		t1.start();
		
		ThreadEx t2 = new ThreadEx();
		t2.start();

		Thread t3 = new Thread(new ThreadRun());
		t3.start();
		

		Thread t4 = new Thread(new ThreadRun());
		t4.start();
	
	}

}
