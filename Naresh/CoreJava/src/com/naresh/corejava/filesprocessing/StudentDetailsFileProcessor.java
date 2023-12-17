package com.naresh.corejava.filesprocessing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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

}
