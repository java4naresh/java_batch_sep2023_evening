package com.naresh.corejava.filesprocessing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentDetailsFileProcessor {
	
	public String saveStudentDetails(List<StudentDetails> studentDetails) {
		try {
			File myFile = new File("D:\\files\\student.txt");
			FileWriter writer = new FileWriter(myFile);
			PrintWriter bw = new PrintWriter(writer);
			for(StudentDetails details:studentDetails) {
				bw.write(details.getStudentId()+"-"+details.getStudentName()+"-"+details.getGender()+"-"+details.getGrade());
			    bw.println();
			}
			bw.flush();
		return "saved successfully";
		} catch(IOException ioe) {
			return "not saved successfully";
		} 
	}
	
	/**
	 * 
	 * @return
	 */
	public List<StudentDetails> getStudentDetails() {
		try {
			List<StudentDetails> studentList = new ArrayList<>();
			File myFile = new File("D:\\files\\studentdetails.txt");
			FileReader reader = new FileReader(myFile);
			BufferedReader br = new BufferedReader(reader);
			String line = br.readLine();
			while(line != null) {
				//System.out.println(line);
				String[] studentStrValues = line.split("-");
				StudentDetails details = new StudentDetails();
				details.setStudentId(Integer.parseInt(studentStrValues[0]));
				details.setStudentName(studentStrValues[1]);
				details.setGender(studentStrValues[2].charAt(0));
				details.setGrade(Integer.parseInt(studentStrValues[3]));
				studentList.add(details);
				line = br.readLine();
			}
			return studentList;
		} catch(Exception e) {
			e.printStackTrace();
			return Collections.EMPTY_LIST;
		} 
	}
	
	public static void main(String[] args) {
		StudentDetailsFileProcessor processor = new StudentDetailsFileProcessor();
		List<StudentDetails> studentList = processor.getStudentDetails();
		System.out.println(studentList);
	}

}
