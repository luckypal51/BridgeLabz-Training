package streamApi.iotsensor;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<Sensor> sensors = new ArrayList<>();
		sensors.add(new Sensor(101,"Door",45));
		sensors.add(new Sensor(102,"Light",30));
		sensors.add(new Sensor(103,"AC",36));
		
		sensors.stream().filter(x->x.reading>30).forEach(System.out::println);
	}
}
