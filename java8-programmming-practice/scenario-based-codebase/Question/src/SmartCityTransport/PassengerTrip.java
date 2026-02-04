package SmartCityTransport;

class PassengerTrip {
    String route;
    double fare;
    boolean peakHour;

    PassengerTrip(String route, double fare, boolean peakHour) {
        this.route = route;
        this.fare = fare;
        this.peakHour = peakHour;
    }

	@Override
	public String toString() {
		return "PassengerTrip [route=" + route + ", fare=" + fare + ", peakHour=" + peakHour + "]";
	}
    
   
}
