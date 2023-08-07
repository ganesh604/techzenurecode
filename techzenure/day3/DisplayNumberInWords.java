package com.techzenure.day3;
import java.util.Scanner;

public class DisplayNumberInWords {
    private static final String[] digitNames = {
        "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Number in words: " + numberToWords(number));
    }

    private static String numberToWords(int number) {
        if (number == 0) {
            return digitNames[0];
        }

        StringBuilder words = new StringBuilder();

        int temp = number;
        int length = (int) Math.log10(number) + 1;

        for (int i = 0; i < length; i++) {
            int digit = temp % 10;
            words.insert(0, digitNames[digit] + " ");
            temp /= 10;
        }

        return words.toString().trim();
    }
}