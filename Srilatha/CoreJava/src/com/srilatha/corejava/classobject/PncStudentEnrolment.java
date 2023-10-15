package com.srilatha.corejava.classobject;

public class PncStudentEnrolment {
	String studentName;
	String studentCourse;
	String studentYear;
	char gender;
	int studentAge;
	
	
	static String collegeName;
	static String collegeCode;
	
	static {
		collegeName="pnckr";
		collegeCode="pnc@kr";
	}
		public PncStudentEnrolment() {
		}
		public PncStudentEnrolment(String studentName,String studentCourse,String studentYear,char gender,int studentAge) {
			this.studentName=studentName;
			this.studentCourse=studentCourse;
			this.studentYear=studentYear;
			this.gender=gender;
			this.studentAge=studentAge;
			
		
		}
		
		
		public void PGCourse() {
			if(studentCourse=="Computers") {
				System.out.println("Students are eligible for Msc and MCA");
			}else {
					System.out.println("Students are not eligible for Msc and MCA");
				}
		}
			
			public static void collegeStartTime() {
				
				System.out.println("According to the "+collegeName+"timetable,every student should come to college by 10'Am'");
			}
			
			public static void collegeCloseTime() {
				
				System.out.println("According to the "+collegeName+"timetable,every student should leave the college by 5'pm'");
			}


			public static void main(String args[]) {
			PncStudentEnrolment.collegeStartTime();
			PncStudentEnrolment.collegeCloseTime();
			
			PncStudentEnrolment srilatha=new PncStudentEnrolment("Srilatha","Computers","secondyear",'F',23);
			srilatha.PGCourse();
			}
}
		
			
		
		
		
	
	


