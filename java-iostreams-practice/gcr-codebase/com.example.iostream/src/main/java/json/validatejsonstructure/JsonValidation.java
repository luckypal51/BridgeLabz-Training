package json.validatejsonstructure;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonValidation {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        String json = "{\"name\":\"Lucky\",\"age\":21}";

        try {
            mapper.readTree(json); 
            System.out.println("Valid JSON");
        } catch (Exception e) {
            System.out.println("Invalid JSON");
        }
    }
}
