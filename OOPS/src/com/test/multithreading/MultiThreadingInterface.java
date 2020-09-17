package com.test.multithreading;


class MultiThreadingInterface  implements Runnable{
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		//MultiThreadingInterface m1 = new MultiThreadingInterface();
		//Thread t1 = new Thread(m1);
		//t1.start();
		
		
		new Thread(new MultiThreadingInterface()).start();
	}

}