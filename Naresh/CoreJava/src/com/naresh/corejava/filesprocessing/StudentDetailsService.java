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
	
	/**
	 * this method will give only primary student details
	 * @return List<StudentDetails>
	 */
	public List<StudentDetails> getPrimaryStudentDetails() {
		List<StudentDetails> allStudentDetails = processor.getStudentDetails();
		List<StudentDetails> primaryStudentDetails = new ArrayList<>();
		for(StudentDetails student : allStudentDetails) {
			if(student.getGrade() < 8) {
				primaryStudentDetails.add(student);
			}
		}
		return primaryStudentDetails;
	}
	
	/**
	 * this method will give only high school student details
	 * @return List<StudentDetails>
	 */
	public List<StudentDetails> getHighSchoolStudentDetails() {
		List<StudentDetails> allStudentDetails = processor.getStudentDetails();
		List<StudentDetails> highStudentDetails = new ArrayList<>();
		for(StudentDetails student : allStudentDetails) {
			if(student.getGrade() > 7) {
				highStudentDetails.add(student);
			}
		}
		return highStudentDetails;
	}
	
	/**
	 * this method will give only all student details
	 * @return List<StudentDetails>
	 */
	public List<StudentDetails> getAllStudentDetails() {
		List<StudentDetails> allStudentDetails = processor.getStudentDetails();
		
		return allStudentDetails;
	}
	
	public StudentDetails getStudentDetailsById(Integer id, Integer grade) {
		return processor.getStudentDetailsById(id, grade);
	}

}
