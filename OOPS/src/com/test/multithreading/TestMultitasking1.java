package com.test.multithreading;

class TestMultitasking1 extends Thread {
	public void run() {
		System.out.println("task one");
	}

	public static void main(String args[]) {
		
		System.out.println( "main thread name is:" +Thread.currentThread().getName());
		TestMultitasking1 t1 = new TestMultitasking1();
		TestMultitasking1 t2 = new TestMultitasking1();
		TestMultitasking1 t3 = new TestMultitasking1();
		t1.start();
		t2.start();
		t3.start();
	}
}