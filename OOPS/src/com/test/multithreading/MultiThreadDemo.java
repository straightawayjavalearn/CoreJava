package com.test.multithreading;




class MultiThreadDemo extends Thread{
	public void run() {
		System.out.println("thread is running...");
		
		add();
	}
	
	public void add() {
		System.out.println("I am simple add method");
	}

	public static void main(String args[]) {
		MultiThreadDemo t1 = new MultiThreadDemo();
		t1.start();
	
	}
}