package com.inheritence;

public class Thermostat extends Device{
	  float temperatureSetting;
    
	  public Thermostat(long deviceId, String status,  float temperatureSetting) {
		super(deviceId, status);
		this.temperatureSetting = temperatureSetting;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void status() {
		// TODO Auto-generated method stub
		super.status();
		 System.out.println("Temp     : "+this.temperatureSetting);
	}
      
}
