package com.techzenure.day4;
import java.util.Scanner;

public class Studentreportcard {

	public static void main(String[] args) {
		//def generate_report_card():
		
			Scanner sc = new Scanner(System.in);
			System.out.println("enter student name :");
		    String name = sc.next();
		   // System.out.println("Name : "+name);
		    
		    System.out.println("enter no of subjects: ");	
		    int num_subjects = sc.nextInt();
		    
		    int total_marks = 0;
		    int[] subject_marks = new int[num_subjects];
		    String[] subject_name = new String[num_subjects];
		    int i=1;
		    for (int j = 0; j < subject_marks.length; j++) {
				int k = subject_marks[j];
				System.out.println("enter mark for Subject-{"+ i +"}: ");
				subject_marks[j] = sc.nextInt();
				subject_name[j] = "Subject-{"+ i++ +"}: " ;
				total_marks = total_marks+subject_marks[j];
		    }
		    double average_marks = total_marks / num_subjects;
		    
		    //Print the report card
		    System.out.println("REPORT CARD");
		    System.out.println("..............................................................................................................");
		    System.out.println("NAME: " + name);
		    System.out.println("..............................................................................................................");
		    System.out.println("SUBJECT"+"\t"+"\t"+"MARK");
		    System.out.println("..............................................................................................................");
		    
		    for (int j = 0; j < subject_marks.length; j++) {
			    System.out.println(subject_name[j]+"\t"+"\t"+subject_marks[j]);
		    }
		    System.out.println("..............................................................................................................");
		    System.out.print("TOTAL : "+total_marks);
		    System.out.println("\t"+"Average: "+average_marks);
		    System.out.println("..............................................................................................................");


	}

}