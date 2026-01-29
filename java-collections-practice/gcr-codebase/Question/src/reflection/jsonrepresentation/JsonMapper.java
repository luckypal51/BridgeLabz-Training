package reflection.jsonrepresentation;

import java.lang.reflect.Field;

public class JsonMapper {

    public static String toJson(Object obj) throws IllegalAccessException {
        Class<?> cls = obj.getClass();
        StringBuilder json = new StringBuilder();
        json.append("{");

        Field[] fields = cls.getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true); 

            String name = field.getName();
            Object value = field.get(obj);

            if (value instanceof String) {
                json.append("\"").append(name).append("\":\"").append(value).append("\"");
            } else {
                json.append("\"").append(name).append("\":").append(value);
            }

            if (i != fields.length - 1) {
                json.append(", ");
            }
        }

        json.append("}");
        return json.toString();
    }
}
