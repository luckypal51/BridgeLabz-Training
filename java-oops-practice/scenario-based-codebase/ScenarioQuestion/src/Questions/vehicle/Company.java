package Questions.vehicle;

import java.util.ArrayList;

public class Company {
    ArrayList<Vehicle> arr = new ArrayList<>();
    
    public Company() {
    	System.out.println("----------Lucky Rent House----------");
    }
    
    public void choice(Vehicle v) {
    	arr.add(v);
    	System.out.println("Successfully rented ");
    }
    public void details(String no) {
    	for(Vehicle v: arr) {
    		if(v.vehicleno.equalsIgnoreCase(no)) {
    			v.details();
    			return;
    		}
    	}
    	System.out.println("Vehicle not found");
    }
}
