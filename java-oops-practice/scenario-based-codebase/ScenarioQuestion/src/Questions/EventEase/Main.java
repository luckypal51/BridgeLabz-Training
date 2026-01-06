package Questions.EventEase;

public class Main {
	public static void main(String[] args) {

        User organizer = new User("U101", "Lucky", "pallucky936@gmail.com");

        Event birthday = new BirthdayEvent(
                "Lucky Birthday","Banquet Hall","12-02-2026",50, organizer,30000);

        Event conference = new ConferenceEvent("Tech Summit","Convention Center","25-03-2026", 300,organizer,200000,100000,25000);

        Event[] events = { birthday, conference };

        for (Event event : events) {
            event.schedule();   
            event.showEventDetails();
        }
    }
}
