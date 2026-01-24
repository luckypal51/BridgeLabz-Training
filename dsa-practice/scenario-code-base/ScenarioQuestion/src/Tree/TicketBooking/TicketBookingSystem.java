package Tree.TicketBooking;
import java.time.LocalDateTime;
import java.util.*;

class TicketBookingSystem {

    private TreeMap<LocalDateTime, Event> events = new TreeMap<>();

   
    public void addEvent(Event e) {
        events.put(e.startTime, e);
        System.out.println("Event added: " + e.name);
    }

    public void cancelEvent(LocalDateTime time) {
        Event removed = events.remove(time);
        if (removed != null) {
            System.out.println("Event cancelled: " + removed.name);
        } else {
            System.out.println("Event not found!");
        }
    }

  
    public void showEvents() {
        System.out.println("Upcoming Events:");
        for (Event e : events.values()) {
            System.out.println(e);
        }
    }
}
