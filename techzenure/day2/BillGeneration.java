/**
 *  program on Bill Generation
 *  @author Mudi Ganesh Kumar
 *  @since 28th July 2023
 */
package com.techzenure.day2;
import java.util.Scanner;

public class BillGeneration {
	
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.print("enter the no of pizzas bought : ");
		int noOfPizzas = scr.nextInt();
		System.out.print("enter the no of puffs bought : ");
		int noOfPuffs = scr.nextInt();
		System.out.print("enter the no of Cool drinks bought : ");
		int drinks = scr.nextInt();
		int pizzaCost = 100;
		int puffCost = 20;
		int coolDrink = 10;
		int totalPizzaCost = pizzaCost*noOfPizzas;
		int totalPuffCost = puffCost*noOfPuffs;
		int totalDrinksCost = coolDrink*drinks;
		double total = totalPizzaCost+totalPuffCost+totalDrinksCost;
		System.out.println("No of Pizzas : "+ noOfPizzas +"     Cost : "+totalPizzaCost);
		System.out.println("No of Puffs : "+ noOfPuffs +"     Cost : "+ totalPuffCost);
		System.out.println("No of Cool Drinks : "+ drinks +"     Cost : "+ totalDrinksCost);

		System.out.println("Total Cost = " +total);
		System.out.println("ENJOY THE SHOW!!!");
		
	}

}