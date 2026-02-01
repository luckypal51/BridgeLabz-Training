package functionalinterface.conversion;

public class Main {
	public static void main(String[] args) {
		System.out.println("Converted weight from kg to lbs     : "+Conversion.conversion("lbs",65));
		System.out.println("Coverted distance from km to mile   : "+Conversion.conversion("miles",15));
		System.out.println("Converted length from foot to inche : "+Conversion.conversion("inche",5));
	}
}
