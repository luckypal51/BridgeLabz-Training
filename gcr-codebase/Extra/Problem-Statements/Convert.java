import java.util.*;
public class Convert{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double temp = sc.nextDouble();
		
		System.out.println("The clecius to fahrenheit "+fahrenheitToCelsius(temp));
		System.out.println("The fahrenheit to celsius "+celsiusToFahrenheit(temp));
	}
	 
	public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}