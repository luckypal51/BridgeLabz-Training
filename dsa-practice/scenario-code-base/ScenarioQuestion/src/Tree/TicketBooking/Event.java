package Tree.TicketBooking;
 import java.time.LocalDateTime;

public class Event {
    int id;
    String name;
    String location;
    LocalDateTime startTime;

    public Event(int id, String name, String location, LocalDateTime startTime) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + location + " | " + startTime;
    }
}
