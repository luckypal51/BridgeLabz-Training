package SmartCityTransport;

public class BusService implements TransportService {

    public String getServiceName() { return "Bus"; }
    public String getRoute() { return "A -> B"; }
    public double getFare() { return 25; }
    public int getDepartureTime() { return 900; }
}
