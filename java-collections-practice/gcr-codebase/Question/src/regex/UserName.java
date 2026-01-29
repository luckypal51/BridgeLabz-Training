package regex;

import java.util.regex.Pattern;

public class UserName {

    private static final String REGEX = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

    public static boolean isValidUsername(String username) {
        return Pattern.matches(REGEX, username);
    }

    public static void main(String[] args) {
        String[] usernames = {"user_123", "123user", "us", "Lucky_05"};

        for (String u : usernames) {
            System.out.println(u + " -> " + (isValidUsername(u) ? "Valid" : "Invalid"));
        }
    }
}
