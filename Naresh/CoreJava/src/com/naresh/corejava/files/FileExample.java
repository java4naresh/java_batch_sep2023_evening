package com.naresh.corejava.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileExample {

	public static void main(String[] args) {
		//FileExample.createFile("D:\\files\\sep2023morning\\sample.txt");
		//FileExample.writeDataIntoFile("D:\\files\\sep2023morning\\sample.txt", "Hello Team Are You following my lcture!");
		FileExample.readDataFromFile("D:\\files\\sep2023morning\\sample.txt");
	}
	
	public static void createFile(String fileNameAndLocation) {
		try {
			File myFile = new File(fileNameAndLocation);
			myFile.createNewFile();
			System.out.println("File is created");
		} catch(Exception e) {
			e.printStackTrace();
		} 
		
	}
	
	public static void writeDataIntoFile(String fileName, String data) {
		try {
			File myFile = new File(fileName);
			FileWriter writer = new FileWriter(myFile);
			writer.write(data);
			writer.flush();
			System.out.println("Data was written in to the file successfully!");
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static void readDataFromFile(String fileName) {
		try {
			File myFile = new File(fileName);
			FileReader reader = new FileReader(myFile);
			int val = reader.read();
			while(val != -1) {
				System.out.print((char)val);
				val = reader.read();
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
	
	

}
