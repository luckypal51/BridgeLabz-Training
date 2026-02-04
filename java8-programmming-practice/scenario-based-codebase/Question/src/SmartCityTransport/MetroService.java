package SmartCityTransport;

public class MetroService implements TransportService {

    public String getServiceName() { return "Metro"; }
    public String getRoute() { return "C -> D"; }
    public double getFare() { return 40; }
    public int getDepartureTime() { return 830; }
}
