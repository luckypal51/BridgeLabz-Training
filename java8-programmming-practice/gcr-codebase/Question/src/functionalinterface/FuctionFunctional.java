package functionalinterface;

import java.util.function.Function;

public class FuctionFunctional {
    public static void main(String[] args) {
		Function<String, Integer> limitcheck = (String s)->{return s.length();};
		
		int limit = limitcheck.apply("sdfghjklertyuqwertghjk");
		
		System.out.println(limit>15?"limit exceed":"Under Limit");
		
	}
}
