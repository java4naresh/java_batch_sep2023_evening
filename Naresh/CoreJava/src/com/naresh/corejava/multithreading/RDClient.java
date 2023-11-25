package com.naresh.corejava.multithreading;

public class RDClient {

	public static void main(String[] args) {
		MyThread6 t = new MyThread6();
		//t.run();
		t.start();
        System.out.println(Thread.currentThread().getName());
	}

}
