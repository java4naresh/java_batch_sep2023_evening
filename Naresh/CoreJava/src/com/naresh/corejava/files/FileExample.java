package com.naresh.corejava.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileExample {

	public static void main(String[] args) {
		//FileExample.createFile("D:\\files\\sep2023morning\\sample.txt");
		//FileExample.writeDataIntoFileUsingBufferedWriter("D:\\files\\sep2023morning\\sample.txt", "Hello Team Are You following my lcture!");
		//FileExample.readDataFromFile("D:\\files\\sep2023morning\\sample.txt");
		//FileExample.readDataFromFileUsingBufferedReader("D:\\files\\sep2023morning\\sample.txt");
		FileExample.writeDataIntoFileUsingPrintWriter("D:\\files\\sep2023morning\\sample.txt", "Hello Team Are You following my lcture!");
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
	
	public static void writeDataIntoFileUsingPrintWriter(String fileName, String data) {
		try {
			File myFile = new File(fileName);
			FileWriter writer = new FileWriter(myFile);
			PrintWriter bw = new PrintWriter(writer);
			bw.write(data);
			bw.println();
			bw.write(data);
			bw.println();
			bw.write(data);
			bw.println();
			bw.print("Naresh");
			bw.println();
			bw.print(30);
			bw.println();
			bw.print(20000.00);
			bw.println();
			bw.print(false);
			bw.flush();
			System.out.println("Data was written in to the file successfully!");
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static void writeDataIntoFileUsingBufferedWriter(String fileName, String data) {
		try {
			File myFile = new File(fileName);
			FileWriter writer = new FileWriter(myFile);
			BufferedWriter bw = new BufferedWriter(writer);
			bw.write(data);
			bw.newLine();
			bw.write(data);
			bw.newLine();
			bw.write(data);
			bw.flush();
			System.out.println("Data was written in to the file successfully!");
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static void writeDataIntoFile(String fileName, String data) {
		try {
			File myFile = new File(fileName);
			FileWriter writer = new FileWriter(myFile);
			writer.write(data);
			writer.write("\n");
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
	
	public static void readDataFromFileUsingBufferedReader(String fileName) {
		try {
			File myFile = new File(fileName);
			FileReader reader = new FileReader(myFile);
			BufferedReader br = new BufferedReader(reader);
			String line = br.readLine();
			/*System.out.println(line);
			String line2 = br.readLine();
			System.out.println(line2);
			String line3 = br.readLine();
			System.out.println(line3);
			String line4 = br.readLine();
			System.out.println(line4);*/
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
	
	

}
