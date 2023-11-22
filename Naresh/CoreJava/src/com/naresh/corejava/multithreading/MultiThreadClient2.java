package com.naresh.corejava.multithreading;

public class MultiThreadClient2 {

	public static void main(String[] args) throws InterruptedException {
		MyThread2 t1 = new MyThread2();
		Thread thread1 = new Thread(t1);
		thread1.setName("naresh1");
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread1.start();//new thread will start
		
		MyThread2 t2 = new MyThread2();
		Thread thread2 = new Thread(t1);
		thread2.setName("naresh2");
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread2.sleep(5000);
		thread2.start();//new thread will start
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().sleep(10000);
		for(int i=1; i<=1000; i++) {
			System.out.println(i+" "+ Thread.currentThread().getName());
		}

	}

}
