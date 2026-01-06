package Questions.EventEase;

public class BirthdayEvent extends Event {

    public BirthdayEvent(String name, String location, String date,
                          int attendees, User organizer, double venueCost) {
        super(name, location, date, attendees, organizer, venueCost);
    }

    @Override
    public void schedule() {
        System.out.println("Birthday Event scheduled with cake & decorations!");
    }
}
