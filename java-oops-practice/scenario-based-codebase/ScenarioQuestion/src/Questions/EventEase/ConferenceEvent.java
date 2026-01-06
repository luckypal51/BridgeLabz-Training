package Questions.EventEase;

public class ConferenceEvent extends Event {

    public ConferenceEvent(String name, String location, String date,
                            int attendees, User organizer,
                            double venueCost, double serviceCost, double discount) {

        super(name, location, date, attendees, organizer,
              venueCost, serviceCost, discount);
    }

    @Override
    public void schedule() {
        System.out.println("Conference scheduled with speakers & AV setup.");
    }
}
