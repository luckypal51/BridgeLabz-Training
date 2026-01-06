package Questions.EventEase;

import java.util.UUID;

public abstract class Event implements ISchedulable {

    protected final String eventId;  
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;
    protected User organizer;

  
    private double venueCost;
    private double serviceCost;
    private double discount;

   
    public Event(String eventName, String location, String date,
                 int attendees, User organizer, double venueCost) {

        this.eventId = UUID.randomUUID().toString();
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.organizer = organizer;
        this.venueCost = venueCost;
    }

    
    public Event(String eventName, String location, String date,
                 int attendees, User organizer,
                 double venueCost, double serviceCost, double discount) {

        this(eventName, location, date, attendees, organizer, venueCost);
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    
    public double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

 
    protected void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }

    protected void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getEventId() {
        return eventId;
    }

    public void showEventDetails() {
        System.out.println("Event ID: " + eventId);
        System.out.println("Event: " + eventName);
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
        System.out.println("Attendees: " + attendees);
        System.out.println("Organizer: " + organizer.getName());
        System.out.println("Total Cost: ₹" + calculateTotalCost());
        System.out.println("-----------------------------------");
    }

    
    @Override
    public abstract void schedule();

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println(eventName + " rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println(eventName + " has been cancelled.");
    }
}
