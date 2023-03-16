package com.springcore;

public class Student {
	private int studentId;
	private String studentNaame;
	private String studentAddress;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentNaame() {
		return studentNaame;
	}
	public void setStudentNaame(String studentNaame) {
		this.studentNaame = studentNaame;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public Student(int studentId, String studentNaame, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentNaame = studentNaame;
		this.studentAddress = studentAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentNaame=" + studentNaame + ", studentAddress="
				+ studentAddress + "]";
	}

}
