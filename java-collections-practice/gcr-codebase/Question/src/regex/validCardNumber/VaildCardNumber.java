package regex.validCardNumber;

import java.util.regex.Pattern;

public class VaildCardNumber {

    private static final String CARD_REGEX = "^(4\\d{15}|5\\d{15})$";

    public static boolean isValidCard(String cardNumber) {
        return Pattern.matches(CARD_REGEX, cardNumber);
    }

    public static void main(String[] args) {
        String card1 = "4123456789012345"; 
        String card2 = "5123456789012345"; 
        String card3 = "1234567898754651"; 

        System.out.println(card1 + "->" + isValidCard(card1));
        System.out.println(card2 + "->" + isValidCard(card2));
        System.out.println(card3 + "->" + isValidCard(card3));
    }
}
