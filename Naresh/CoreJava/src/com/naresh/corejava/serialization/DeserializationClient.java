package com.naresh.corejava.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationClient {

	public static void main(String[] args) {
		DeserializationClient.dodesrializationforExternalization();

	}
	
	public static void dodeserialization() {
		//deserailization process
				try {
				FileInputStream fis = new FileInputStream("D:\\files\\sep2023morning\\pavan.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);
				MyStdent pavan = (MyStdent)ois.readObject();
				System.out.println(pavan);
				} catch(Exception e) {
					e.printStackTrace();
				}
	}
	
	public static void dodesrializationforExternalization() {
		//deserailization process
		try {
		FileInputStream fis = new FileInputStream("D:\\files\\sep2023morning\\rohit.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		IndianCricketer rohit = (IndianCricketer)ois.readObject();
		System.out.println(rohit);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
