package com.aggreyah.mathteacher;

class Teacher {
	String designation = "Teacher";
	String college = "Beginnersbook";
	void does() {
		System.out.println("Teaching");
	}
}


public class MathTeacher extends Teacher {
	
	String mainSubject = "Maths";
	public static void main(String[] args) {
		MathTeacher obj0 = new MathTeacher();
		System.out.println("Designation: " + obj0.designation);
		System.out.println("College: " + obj0.college);
		System.out.println("Subject: " + obj0.mainSubject);
		obj0.does();
	}

}
