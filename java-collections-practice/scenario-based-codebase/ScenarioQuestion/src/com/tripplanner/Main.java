package com.tripplanner;

public class Main {
   public static void main(String[] args) throws Exception {
	   Process pro = new Process();
	   pro.insert(new Trip("Bhopal","India",7));
	   pro.addTrip();
	   pro.insert(new Trip("Bhopal","India",7));
	   pro.addTrip();
	   pro.insert(new Trip("New York","North America",7));
	   pro.addTrip();
	   pro.insert(new Trip("Bhopal","India",7));
	   pro.addTrip();
	   pro.insert(new Trip("Indore","India",7));
	   pro.addTrip();
	   pro.insert(new Trip("Indore","India",7));
	   pro.addTrip();
	   pro.insert(new Trip("New York","North America",7));
	   pro.addTrip();
	   pro.topCityVisited();
	   pro.country();
   }
}
