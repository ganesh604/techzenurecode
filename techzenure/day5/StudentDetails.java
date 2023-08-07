package com.techzenure.day5;
import java.util.Scanner;

class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;
	private String collegeName;

	// Constructor for NIT students
	public Student(int studentId, String studentName, String studentAddress) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = "NIT";
	}

	// Constructor for students from other colleges
	public Student(int studentId, String studentName, String studentAddress, String collegeName) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = collegeName;
	}

	// Getters
	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public String getCollegeName() {
		return collegeName;
	}
}

public class StudentDetails {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Student's Id: ");
		int studentId = scanner.nextInt();

		scanner.nextLine(); // Consume the newline left by nextInt()

		System.out.print("Enter Student's Name: ");
		String studentName = scanner.nextLine();

		System.out.print("Enter Student's Address: ");
		String studentAddress = scanner.nextLine();
		System.out.print("Whether the student is from NIT (Yes/No): ");
		String isFromNIT = scanner.next();

		if (isFromNIT.equalsIgnoreCase("yes")) {
			Student student = new Student(studentId, studentName, studentAddress);
			displayStudentDetails(student);
		} else if (isFromNIT.equalsIgnoreCase("no")) {
			System.out.print("Enter the college name: ");
			String collegeName = scanner.next();
			Student student = new Student(studentId, studentName, studentAddress, collegeName);
			displayStudentDetails(student);
		} else {
			System.out.println("Wrong Input");
		}
	}

	private static void displayStudentDetails(Student student) {
		System.out.println("Student id: " + student.getStudentId());
		System.out.println("Student name: " + student.getStudentName());
		System.out.println("Address: " + student.getStudentAddress());
		System.out.println("College Name: " + student.getCollegeName());
	}
}