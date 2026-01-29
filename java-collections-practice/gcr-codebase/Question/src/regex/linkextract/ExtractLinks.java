package regex.linkextract;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {
    public static void main(String[] args) {

        String text = "Visit https://www.google.com and http://lucky.com";

        String regex = "https?://[^\\s]+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Extracted Links:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
