package com.classandobject.level2;

public class MovieTicketPrint {

	public static void main(String[] args) {
MovieTicket ticket1=new MovieTicket("Dragon");
		
		//calling the method
		ticket1.displayTicket();
		ticket1.bookTicket("A10",120.0);
		ticket1.bookTicket("B10", 120.0);
		ticket1.bookTicket("A11", 120.0);//booking the ticket which is already booked
		ticket1.displayTicket();

	}

}
