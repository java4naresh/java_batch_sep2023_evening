package com.naresh.corejava.multithreading;

public class MultiThreadClient {

	public static void main(String[] args) {
		MyThread mt = new MyThread();//new thread will create (born)
		mt.setName("naresh1");
		mt.start();//new thread will start from here
		//mt.start();//IllegalThreadStateException
		MyThread mt2 = new MyThread();//new thread will create (born)
		mt2.setName("naresh2");
		mt2.start();//new thread will start from here
		
		for(int i=1; i<=1000; i++) {
			System.out.println(i+" "+ Thread.currentThread().getName());
		}

	}

}
