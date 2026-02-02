package streamApi.gymmembership;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<GymMember> gym = new ArrayList<>();
		gym.add(new GymMember("Lucky",LocalDate.of(2026, 2, 15)));
		gym.add(new GymMember("Himesh", LocalDate.of(2026, 2, 2)));
		gym.add(new GymMember("Nageshwar",LocalDate.of(2026, 12, 10)));
		
		gym.stream().filter(x->ChronoUnit.DAYS.between(LocalDate.now(),x.expiry)<30).forEach(System.out::println);
	}
}
