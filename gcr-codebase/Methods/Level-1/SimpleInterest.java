import java.util.*;
public class SimpleInterest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double principle = sc.nextDouble();
		double rate = sc.nextDouble();
		double time = sc.nextDouble();
		
		double si = simpleInterest(principle,rate,time);
		System.out.println("The Simple Interest is "+si+" for Principal "+principle+", Rate of Interest "+rate+" and Time "+time);
	}
	
	public static double simpleInterest(double p, double r, double t){
		return (p*r*t)/100;
	}
}