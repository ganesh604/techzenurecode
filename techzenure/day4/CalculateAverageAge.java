package com.techzenure.day4;
import java.util.Scanner;

public class CalculateAverageAge {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter no of employes : ");
	    int noOfEmp = input.nextInt();
	        

		int[] age = new int[noOfEmp];
        System.out.println("Enter the age for "+noOfEmp+" employes");
		for (int i = 0; i < age.length; i++) {
	        age[i] = input.nextInt();			
		}
		double avgAge = calculateAvarage(age);
		
		if(avgAge==1) {
			System.out.println("Please enter a valid Employe count");
		}else if(avgAge>28) {
			System.out.println("The Average age is "+avgAge);
		}
		
	}

	private static double calculateAvarage(int[] age) {
		double average = 0;

		try {
			if(age.length<2) {
				average = 1;
			}
			else{
				int a = 0;
				for (int i = 0; i < age.length; i++) {
					a = a + age[i];
					if(age[i]<28||age[i]>40) {
						throw new IllegalArgumentException("Invalid Age encounted");
					}
				}
				average = a/(age.length) ;
				
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		
		}
		
		return average;
	}
}