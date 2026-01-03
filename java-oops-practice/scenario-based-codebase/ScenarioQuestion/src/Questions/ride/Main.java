package Questions.ride;

public class Main {
	public static void main(String[] args) {
		Suv suv = new Suv("MP 04 BH 3230","Lucky Pal","AB20245",4.1f);
		Sedan car = new Sedan("MP 12 BH 3632","Nageshwar","BH54060",3.2f);
		suv.bookRide(5.5);
		suv.details();
		car.details();
	}
}
