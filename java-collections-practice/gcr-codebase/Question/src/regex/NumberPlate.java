package regex;

import java.util.regex.Pattern;

public class NumberPlate {
	  private static final String REGEX = "^[A-Z]{2}[0-9]{4}$";

	    public static boolean isValidPlate(String plate) {
	        return Pattern.matches(REGEX, plate);
	    }

	    public static void main(String[] args) {
	        String[] plates = {"AB1234", "A12345", "ab1234", "XY9999"};

	        for (String p : plates) {
	            System.out.println(p + " -> " + (isValidPlate(p) ? "Valid" : "Invalid"));
	        }
	    }
}
