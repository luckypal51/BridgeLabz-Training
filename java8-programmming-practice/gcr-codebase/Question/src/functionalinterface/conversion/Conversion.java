package functionalinterface.conversion;

public interface Conversion {
    public static double conversion(String con,double num) {
    	if(con.equalsIgnoreCase("miles")) {
    		return num * 0.621371;
    	}
    	
    	if(con.equalsIgnoreCase("lbs")) {
    		return num * 2.20462;
    	}
    	
    	System.out.println("Enter valid conversion unit");
    	return -1;
    }
}
