package com.example.dependencyinjection;

public class Student {

	private String studentName;
	private int studentId;


	public Student(int studentId) {
		this.studentId = studentId;
	}

	/**
	 * @param studentName
	 * @param studentId
	 */
	public Student(String studentName, int studentId) {
		this.studentName = studentName;
		this.studentId = studentId;
	}


	/**	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setstudentId(int studentId) {
		this.studentId = studentId;
	}
	 **/
	public void displayStudentInfo() {
		System.out.println("Student Name is : " + studentName
				+ " and Student Id is : " + studentId);
	}
}
