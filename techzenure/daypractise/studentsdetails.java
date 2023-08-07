package com.techzenure.daypractise;
import java.util.Scanner;

	
	public class studentsdetails {
	
	    public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter name of student: ");
	        String n = in.nextLine();       
	        System.out.print("Enter marks in 1st subject: ");
	        int m1 = in.nextInt();
	        System.out.print("Enter marks in 2nd subject: ");
	        int m2 = in.nextInt();
	        System.out.print("Enter marks in 3rd subject: ");
	        int m3 = in.nextInt();
	        System.out.print("Enter marks in 4th subject: ");
	        int m4 = in.nextInt();
	        System.out.print("Enter marks in 5th subject: ");
	        int m5 = in.nextInt();
	        int t = m1 + m2 + m3 + m4 + m5;
	        int m6 = in.nextInt();
	        System.out.println();
	     
	            
	        System.out.println("Total Marks = " + t);
	        System.out.println("Total subjects = " + t);
	       
	}
	}