package com.test.multithreading;

//Java program to illustrate the
//behaviour of notify() method
class Myclass1 extends Thread {
	
public void run()
 {
     synchronized(this)
     {
         System.out.println(Thread.currentThread().getName() + "...starts");
         try {
             this.wait();
         }
         catch (InterruptedException e) {
             e.printStackTrace();
         }
         System.out.println(Thread.currentThread().getName() + "...notified");
     }
 }
} 

class Myclass2 extends Thread {
	
 Myclass1 myclass1;
 
 Myclass2(Myclass1 myclass1)
 {
     this.myclass1 = myclass1;
 }
public void run()
 {
     synchronized(this.myclass1)
     {
         System.out.println
         (Thread.currentThread().getName() + "...starts");

         try {
             this.myclass1.wait();
         }
         catch (InterruptedException e) {
             e.printStackTrace();
         }
         System.out.println
         (Thread.currentThread().getName() + "...notified");
     }
 }
} 

class Myclass3 extends Thread {
	
 Myclass1 myclass1;
 
 Myclass3(Myclass1 myclass1)
 {
     this.myclass1 = myclass1;
 }
public void run()
 {
     synchronized(this.myclass1)
     {
         System.out.println
         (Thread.currentThread().getName() + "...starts");
         this.myclass1.notify();
         System.out.println
         (Thread.currentThread().getName() + "...notified");
     }
 }
} 
class NotifyDemo {
public static void main(String[] args) throws InterruptedException
 {

     Myclass1 myclass1 = new Myclass1();//wait()
     Myclass2 myclass2 = new Myclass2(myclass1);//wait()
     Myclass3 myclass3 = new Myclass3(myclass1);//notify()
     Thread t1 = new Thread(myclass1, "Thread-1");
     Thread t2 = new Thread(myclass2, "Thread-2");
     Thread t3 = new Thread(myclass3, "Thread-3");
     t1.start();
     t2.start();
     Thread.sleep(100);
     t3.start();
 }
}
