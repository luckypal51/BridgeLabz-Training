package functionalinterface;

import java.util.function.Predicate;

public class Temperature {
   public static void main(String[] args) {
	  Predicate<Double> temp = (x)->x>45;
	  
	  System.out.println("The alert required "+temp.test(Double.parseDouble("46")));
	  System.out.println("The alert required "+temp.test(new Double(18)));
}
}
