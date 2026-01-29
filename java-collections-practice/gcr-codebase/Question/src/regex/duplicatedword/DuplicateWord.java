package regex.duplicatedword;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWord {

	    public static void main(String[] args) {
	        String text = "This is is a repeated repeated word test.";
	        String regex = "\\b(\\w+)\\b\\s+\\1\\b";
	        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	        Matcher matcher = pattern.matcher(text);
	        System.out.println("Repeating Words:");
	        while (matcher.find()) {
	            System.out.println(matcher.group(1)); 
	        }
	    }
	}


