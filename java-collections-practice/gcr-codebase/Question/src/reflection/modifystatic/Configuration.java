package reflection.modifystatic;


public class Configuration {
    private static String API_KEY = "123456";

    public static void showKey() {
        System.out.println("API_KEY = " + API_KEY);
    }
}
