package com.naresh.corejava.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample2 {

	public static void main(String[] args) throws FileNotFoundException {
		ExceptionExample2.fileNotFoundExceptionExample();
		//ExceptionExample2.readDataFromFile();

	}
	
	public static void fileNotFoundExceptionExample() throws FileNotFoundException {
		
		File myFile = new File("D:\\files\\nikita\\sample.txt");
		FileReader reader = new FileReader(myFile);
		
	}
	
	public static void readDataFromFile() {
		
	}
	
	public static void ioExceptionExample() {
		try {
		File myFile = new File("D:\\files\\nikita\\sample.txt");
		FileReader reader = new FileReader(myFile);
		reader.read();
		} catch(IOException fne) {
			fne.printStackTrace();
		} finally {
			
		}
	}

}
