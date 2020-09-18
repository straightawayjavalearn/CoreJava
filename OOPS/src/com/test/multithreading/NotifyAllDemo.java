
package com.test.multithreading;
// Java program to illustrate the
// behavior of notifyAll() method
class MyTest1 extends Thread {
public void run()
    {
        synchronized(this)
        {
            System.out.println
            (Thread.currentThread().getName() + "...starts");
            try {
                this.wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println
            (Thread.currentThread().getName() + "...notified");
        }
    }
} class MyTest2 extends Thread {
    MyTest1 MyTest1;
    MyTest2(MyTest1 MyTest1)
    {
        this.MyTest1 = MyTest1;
    }
public void run()
    {
        synchronized(this.MyTest1)
        {
            System.out.println
            (Thread.currentThread().getName() + "...starts");
  
            try {
                this.MyTest1.wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println
            (Thread.currentThread().getName() + "...notified");
        }
    }
} class MyTest3 extends Thread {
    MyTest1 MyTest1;
    MyTest3(MyTest1 MyTest1)
    {
        this.MyTest1 = MyTest1;
    }
public void run()
    {
        synchronized(this.MyTest1)
        {
            System.out.println
            (Thread.currentThread().getName() + "...starts");
  
            this.MyTest1.notifyAll();
            System.out.println
            (Thread.currentThread().getName() + "...notified");
        }
    }
} class NotifyAllDemo {
public static void main(String[] args) throws InterruptedException
    {
  
        MyTest1 MyTest1 = new MyTest1();
        MyTest2 MyTest2 = new MyTest2(MyTest1);
        MyTest3 MyTest3 = new MyTest3(MyTest1);
        Thread t1 = new Thread(MyTest1, "Thread-1");
        Thread t2 = new Thread(MyTest2, "Thread-2");
        Thread t3 = new Thread(MyTest3, "Thread-3");
        t1.start();
        t2.start();
        Thread.sleep(100);
        t3.start();
    }
}
