package SmartCityTransport;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
    	List<TransportService> services = Arrays.asList(
    	        new BusService(),
    	        new MetroService(),
    	        new AmbulanceService()
    	);

    	services.stream()
    	        .filter(s -> s.getFare() <= 30)
    	        .sorted(Comparator.comparingInt(
    	                TransportService::getDepartureTime))
    	        .forEach(TransportService::printServiceDetails);

    	List<PassengerTrip> trips = Arrays.asList(
    	        new PassengerTrip("A → B", 25, true),
    	        new PassengerTrip("A → B", 25, false),
    	        new PassengerTrip("C → D", 40, true)
    	);
    	Map<String, List<PassengerTrip>> tripsByRoute =
    	        trips.stream()
    	             .collect(Collectors.groupingBy(t -> t.route));
       for(var a: tripsByRoute.entrySet()) {
    	   System.out.println(a.getKey()+" - "+a.getValue().toString());
       }
       DoubleSummaryStatistics revenueStats =
    	        trips.stream()
    	             .collect(Collectors.summarizingDouble(t -> t.fare));

    	System.out.println("Total Revenue: $" + revenueStats.getSum());
    	System.out.println("Average Fare: $" + revenueStats.getAverage());

	}
}
