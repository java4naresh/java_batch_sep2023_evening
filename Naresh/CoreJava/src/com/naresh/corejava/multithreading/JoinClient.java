package com.naresh.corejava.multithreading;

public class JoinClient {

	public static void main(String[] args) throws InterruptedException {
		MyThread4 t = new MyThread4();
		t.setName("naresh");
		t.start();
		t.join();//Waits for this thread to die
		
		for(int i=501;i<=1000;i++) {
			System.out.println(i + " "+ Thread.currentThread().getName());
		}

	}

}
