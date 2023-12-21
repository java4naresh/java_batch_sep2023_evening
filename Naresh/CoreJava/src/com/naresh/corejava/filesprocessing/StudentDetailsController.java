package com.naresh.corejava.filesprocessing;

import java.util.ArrayList;
import java.util.List;

public class StudentDetailsController {
	
	public static void main(String[] args) {
		List<StudentDetails> details = new ArrayList<>();
		StudentDetails s1 = new StudentDetails(1, "Naresh", 'M', 10);
		StudentDetails s2 = new StudentDetails(2, "Pavan", 'M', 10);
		StudentDetails s3 = new StudentDetails(4, "Srilatha", 'F', 10);
		StudentDetails s4 = new StudentDetails(6, "Shyamala", 'M', 10);
		StudentDetails s5 = new StudentDetails(null, "Naresh", 'M', 10);
		StudentDetails s6 = new StudentDetails(1, null, 'M', 10);
		details.add(s1);
		details.add(s2);
		details.add(s3);
		details.add(s4);
		details.add(s5);
		details.add(s6);
		StudentDetailsService service = new StudentDetailsService();
		//String result = service.validateStudentDetailsAndProcess(details);
		//System.out.println(result);
		
		/*List<StudentDetails> primaryStudentDetails = service.getPrimaryStudentDetails();
	    System.out.println(primaryStudentDetails);*/
		
		/*List<StudentDetails> highStudentDetails = service.getHighSchoolStudentDetails();
	    System.out.println(highStudentDetails);*/
		
		//List<StudentDetails> allStudentDetails = service.getAllStudentDetails();
	    //System.out.println(allStudentDetails);
		
		StudentDetails student = service.getStudentDetailsById(10, 1);
		System.out.println(student);
	}

}
