package com.techzenure.day3;
public class DisplaySequence {
    public static void main(String[] args) {
        int  Sequence1 = 1;
        int  Sequence2 = 4;
        int  Sequence3 = 7;
        int  Sequence4 = 10;

        // Display the first 15 elements of Sequence 1
        System.out.print("Sequence 1: ");
        for (int i = 0; i < 15; i++) {
            System.out.print( Sequence1 + " ");
             Sequence1 += 1;
        }
        // Display the first 15 elements of Sequence 2
        System.out.print("\nSequence 2: ");
        for (int i = 0; i < 15; i++) {
            System.out.print( Sequence2 + " ");
             Sequence2 += 4;
        }
        // Display the first 15 elements of Sequence 3
        System.out.print("\nSequence 3: ");
        for (int i = 0; i < 15; i++) {
            System.out.print( Sequence3 + " ");
             Sequence3 += 7;
        }

        // Display the first 15 elements of Sequence 4
        System.out.print("\nSequence 4: ");
        for (int i = 0; i < 15; i++) {
            System.out.print( Sequence4 + " ");
             Sequence4 += 10;
        }
    }

}