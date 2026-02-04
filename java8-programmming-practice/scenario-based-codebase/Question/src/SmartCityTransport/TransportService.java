package SmartCityTransport;

public interface TransportService {

    String getServiceName();
    String getRoute();
    double getFare();
    int getDepartureTime();

    default void printServiceDetails() {
        System.out.println(getServiceName() +
                "\nRoute: " + getRoute() +
                "\nFare: " + getFare() +
                "\nTime: " + getDepartureTime());
    }
}
