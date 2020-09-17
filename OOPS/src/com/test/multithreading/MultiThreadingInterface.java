package com.test.multithreading;

class Student{
	
}

interface address{
	public void addAddress();
}

class MultiThreadingInterface extends Student implements Runnable,address{
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		MultiThreadingInterface m1 = new MultiThreadingInterface();
		Thread t1 = new Thread(m1);
		t1.start();
	}

	@Override
	public void addAddress() {
		System.out.println("I am address inte");
		
	}
}