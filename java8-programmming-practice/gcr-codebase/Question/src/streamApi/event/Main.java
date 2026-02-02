package streamApi.event;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<Attendee> attendee = new ArrayList<>();
		attendee.add(new Attendee("Lucky",true));
		attendee.add(new Attendee("Himesh",false));
		attendee.add(new Attendee("Nageshwar",true));
		attendee.add(new Attendee("Arvind",false));
		
		attendee.stream().filter(Attendee::isAttending).forEach(System.out::println);
	}
}
