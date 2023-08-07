package com.techzenure.day3;
import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = input.nextInt();
        System.out.print("Enter the last number: ");
        int y = input.nextInt();

        if (x % 2 == 0) {
            x += 2;
        } else {
            x += 1;
        }

        System.out.print("Even Numbers between " + x + " and " + y + " are\n");

        if (x <= y) {
            for (int i = x; i < y; i += 2) {
                System.out.print(i + " ");
            }
        } else {
            System.out.print("ERROR: Invalid Input:: second number should be greater than or equal to the first number");
        }
    }
}