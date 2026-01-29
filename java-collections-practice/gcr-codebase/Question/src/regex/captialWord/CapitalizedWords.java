package regex.captialWord;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizedWords {
    public static void main(String[] args) {

        String text = "The Lucky is Best Coder in The World.";

        String regex = "\\b[A-Z][a-z]*\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Capitalized Words:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
