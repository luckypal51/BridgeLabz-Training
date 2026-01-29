package regex;

import java.util.regex.Pattern;

public class Hexadecimal {
    private static final String regex = "^#[A-Za-z0-9]{5}$";
    
    public static boolean isValid(String s) {
    	return Pattern.matches(regex, s);
    }
    
    public static void main(String[] args) {
    	String [] arr = {"#AF778","#Ff152","#g45"};
    	for(String s: arr) {
    		System.out.println(s+"->"+(isValid(s)?"Valid":"inValid"));
    	}
    }
}
