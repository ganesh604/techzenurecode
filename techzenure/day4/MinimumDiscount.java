package com.techzenure.day4;
import java.util.Arrays;
import java.util.Scanner;

public class MinimumDiscount {

	public static void main(String[] args) {

		int minimum = 100;
		String miniItems = "";
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the no of Items : ");

		int noOfItms = input.nextInt();

		String[] items = new String[noOfItms];
		//System.out.println("");
		for (int i = 0; i < items.length; i++) {
//				while(input.next()==null) {
//				System.out.println("enter");
//				}
				items[i] = input.next();

			}

		System.out.println(Arrays.toString(items));
		try {

				for (int i = 0; i < items.length; i++) {
					String[] str = items[i].split(",");
					if (str.length == 3) {

						int dis = Integer.parseInt(str[2]);

						if (minimum > dis) {
							minimum = dis;
							miniItems = "";
							miniItems = str[0];
						} else if (minimum == dis) {
							miniItems =miniItems+ " "+str[0];
						}

					} else {
						throw new IllegalArgumentException(items[i] + "Invalid Details..." );
					}
				}
				System.out.println("items with minimum discount : "+miniItems);
			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}

}
