package com.techzenure.day5;
import java.util.Scanner;

public class TicketBooking {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter no of bookings: ");
		int noOfBookings = scanner.nextInt();

		System.out.print("Enter the available tickets: ");
		int availableTickets = scanner.nextInt();

		Ticket tc = new Ticket();

		tc.setAvailableTickets(availableTickets);

		// for (int i = 0; i < noOfBookings; i++) {
		System.out.print("Enter the ticketid: ");
		int ticketId = scanner.nextInt();

		System.out.print("Enter the price: ");
		int price = scanner.nextInt();

		System.out.print("Enter the no of tickets: ");
		int noOfTickets;
		int noOfTickets1 = scanner.nextInt();

		tc.setPrice(price);
		tc.setTicketid(ticketId);

		int totalAmount = tc.calculateTicketCost(noOfTickets1);

		if (totalAmount == -1) {
			System.out.println("Tickets are not available for booking.");
		} else {
			System.out.println("Available tickets: " + availableTickets);
			System.out.println("Total amount: " + totalAmount);
			System.out.println("Available tickets after booking: " + tc.getAvailableTickets());
		}

	}
}

class Ticket {
	private int ticketid;
	private int price;
	private int availableTickets;

	// Constructor
	public Ticket(int ticketid, int price, int availableTickets) {
		this.ticketid = ticketid;
		this.price = price;
		this.availableTickets = availableTickets;
	}

	public Ticket() {
		// TODO Auto-generated constructor stub
	}

	// Getters and setters
	public int getTicketid() {
		return ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAvailableTickets() {
		return availableTickets;
	}

	public void setAvailableTickets(int availableTickets) {
		if (availableTickets >= 0) {
			this.availableTickets = availableTickets;
		}
	}

	// Method to calculate the total cost and reduce availableTickets
	public int calculate;

	// Method to calculate the total cost and reduce availableTickets
	public int calculateTicketCost(int noOfTickets) {
		if (noOfTickets <= availableTickets) {
			availableTickets -= noOfTickets;
			return noOfTickets * price;
		}
		return -1;
	}
}