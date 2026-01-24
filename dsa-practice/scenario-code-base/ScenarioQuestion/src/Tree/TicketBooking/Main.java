package Tree.TicketBooking;

import java.time.LocalDateTime;

public class Main {
	   public static void main(String[] args) {

	        TicketBookingSystem system = new TicketBookingSystem();

	        system.addEvent(new Event(101, "Rock Concert", "Delhi",
	                LocalDateTime.of(2026, 2, 10, 18, 0)));

	        system.addEvent(new Event(102, "Tech Conference", "Bangalore",
	                LocalDateTime.of(2026, 1, 30, 10, 0)));

	        system.addEvent(new Event(103, "Cricket Match", "Mumbai",
	                LocalDateTime.of(2026, 2, 5, 15, 30)));

	        system.showEvents();

	        System.out.println("\nCancel Event:");
	        system.cancelEvent(LocalDateTime.of(2026, 2, 5, 15, 30));

	        system.showEvents();
	    }
}
