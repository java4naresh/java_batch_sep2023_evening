package com.naresh.corejava.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationClient {

	public static void main(String[] args) {
		SerializationClient.doExternalization();
	}
	
	public static void doSerialization() {
		try {
			//serailization process
			MyStdent pavan = new MyStdent("Pavan", 'M', "12-06-1994", 28);
			FileOutputStream fos = new FileOutputStream("D:\\files\\sep2023morning\\pavan.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(pavan);
			System.out.println("serialization completed");
			} catch(Exception e) {
				e.printStackTrace();
			}
	}
	
	public static void doExternalization() {
		try {
			//serailization process
			IndianCricketer rohit = new IndianCricketer("Rohit Sharma", 36, "Batsman", "12-12-1975", 200);
			FileOutputStream fos = new FileOutputStream("D:\\files\\sep2023morning\\rohit.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(rohit);
			System.out.println("externalization completed");
			} catch(Exception e) {
				e.printStackTrace();
			}
	}

}
