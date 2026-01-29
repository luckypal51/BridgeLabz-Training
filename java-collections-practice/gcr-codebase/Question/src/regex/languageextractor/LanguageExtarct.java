package regex.languageextractor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LanguageExtarct {

	    public static void main(String[] args) {

	        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

	        String regex = "\\b(JavaScript|Java|Python|Go|C\\+\\+|C#|C|PHP|Ruby|Kotlin|Swift|Rust)\\b";

	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(text);

	        System.out.println("Programming Languages Found:");
	        while (matcher.find()) {
	            System.out.println(matcher.group());
	        }
	    }
	}

