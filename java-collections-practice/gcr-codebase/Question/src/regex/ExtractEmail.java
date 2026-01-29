package regex;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmail {
    private static final String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
    
    public static String extractEmail(String s) {
    	Pattern pattern = Pattern.compile(regex);
    	Matcher match = pattern.matcher(s);
    	if(match.find()) {
    		return match.group();
    	}
    	return "not found";
    }
    public static void main(String[]args) throws IOException {
    	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    	String s = read.readLine();
    	System.out.println((s));
    }
}
