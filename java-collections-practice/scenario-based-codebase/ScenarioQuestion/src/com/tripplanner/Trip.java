package com.tripplanner;

import java.io.Serializable;

public class Trip implements Serializable{
	private static final long serialVersionUID = 1L;
    private String city;
    private String countrie;
    private int duration;
	
    public Trip(String city, String countrie, int duration) {
		this.city = city;
		this.countrie = countrie;
		this.duration = duration;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountrie() {
		return countrie;
	}

	public void setCountrie(String countrie) {
		this.countrie = countrie;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}


    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "\nCountry : "+this.countrie+
    		   "\nCity    : "+this.city+
    	       "\nDuration: "+this.duration;
    }
}
