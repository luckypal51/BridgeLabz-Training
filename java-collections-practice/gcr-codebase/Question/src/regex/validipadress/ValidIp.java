package regex.validipadress;
import java.util.regex.Pattern;

public class ValidIp {
    
    private static final String IP_REGEX =
            "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";

    public static boolean isValidIP(String ip) {
        return Pattern.matches(IP_REGEX, ip);
    }

    public static void main(String[] args) {
        String ip1 = "192.168.1.1";
        String ip2 = "256.100.50.25";

        System.out.println(ip1+"->"+isValidIP(ip1));
        System.out.println(ip2+ "->"+isValidIP(ip2));
    }
}
