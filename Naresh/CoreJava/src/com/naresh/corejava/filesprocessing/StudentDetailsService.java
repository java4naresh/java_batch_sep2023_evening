package com.naresh.corejava.filesprocessing;

import java.util.ArrayList;
import java.util.List;

public class StudentDetailsService {
	
	StudentDetailsFileProcessor processor = new StudentDetailsFileProcessor();
	
	public String validateStudentDetailsAndProcess(List<StudentDetails> studentDetails) {
		//eliminate logic
		return processor.saveStudentDetails(validateData(studentDetails));
	}
	
	private List<StudentDetails> validateData(List<StudentDetails> studentDetails) {
		List<StudentDetails> validDetails = new ArrayList<>();
		for(StudentDetails details: studentDetails) {
			Boolean flag = isValid(details);
			if(flag) {
				validDetails.add(details);
			}
		}
		return validDetails;
	}
	
	private Boolean isValid(StudentDetails details) {
		if(details == null) return false;
		else if(details.getStudentId() == null) return false;
		else if(details.getStudentName() == null) return false;
		else if(details.getGender() == null) return false;
		else if(details.getGrade() == null) return false;
		return true;
	}

}
