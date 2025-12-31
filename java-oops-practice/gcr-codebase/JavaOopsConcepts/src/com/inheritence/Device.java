package com.inheritence;

public class Device {
       long deviceId;
       String status;
	 
       
       public Device(long deviceId, String status) {
		this.deviceId = deviceId;
		this.status = status;
	   }
       
       public void status() {
    	   System.out.println("--------Status---------");
    	   System.out.println("status   : "+this.status);
    	   System.out.println("deviceId : "+this.deviceId);
       }
}
