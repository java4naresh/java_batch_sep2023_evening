package com.naresh.corejava.multithreading;

public class SynchronizedClient {

	public static void main(String[] args) {
		Task task = new Task();
		
		MyThread3 t = new MyThread3(task);
        t.setName("naresh1");
        t.start();
        
       
        MyThread3 t2 = new MyThread3(task);
        t2.setName("naresh2");
        t2.start();
        
        
        MyThread3 t3 = new MyThread3(task);
        t3.setName("naresh3");
        t3.start();
		
	}

}
