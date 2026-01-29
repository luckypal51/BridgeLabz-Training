package anotation.jsonfield;

public class Main {
    public static void main(String[] args) {

        User user = new User("Lucky", 21, "luckypal051203");

        String json = JsonSerializer.toJson(user);

        System.out.println(json);
    }
}
