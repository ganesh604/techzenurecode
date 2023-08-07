package com.techzenure.day3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CinemaTicket {
    public static void main(String[] args) {
        int no, refe = 0;
        double cost,total = 0;
        String ref, co, circle;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of ticket:");
        no = s.nextInt();
        if (no < 5 || no > 40) {
            System.out.println("Minimum of 5 and Maximum of 40 tickets");
        }
        System.out.println("Do you want refreshment:");
        ref = s.next();
        System.out.println("Do you have a coupon code:");
        co = s.next();
        System.out.println("Enter the circle:");
        circle = s.next();
        if (circle.equalsIgnoreCase("k")) {
            total = no * 75;
        } else if (circle.equalsIgnoreCase("q")) {
            total = no * 150;
        } else {
            System.out.println("Invalid Input");
        }
        if (no > 20) {
        	total = ((0.9) * total);
        } 
        if (co.equalsIgnoreCase("y")) {
        	total = ((0.98) * total);
        }
        if (ref.equalsIgnoreCase("y")) {
            refe = no * 50;
            cost = total + refe;
        } else {
            cost = total;
        }
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Ticket cost:" + df.format(cost));
    }
} 
