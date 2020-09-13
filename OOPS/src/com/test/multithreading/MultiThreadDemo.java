package com.test.multithreading;


class MultiThreadDemo extends Thread {
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		MultiThreadDemo t1 = new MultiThreadDemo();
		t1.start();
	}
}