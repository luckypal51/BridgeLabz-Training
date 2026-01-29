package anotation.jsonfield;

import java.lang.reflect.Field;

public class JsonSerializer {

    public static String toJson(Object obj) {
        StringBuilder json = new StringBuilder("{");

        Class<?> c = obj.getClass();
        Field[] fields = c.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField jf = field.getAnnotation(JsonField.class);
                String jsonKey = jf.name();

                field.setAccessible(true);
                try {
                    Object value = field.get(obj);

                    json.append("\"").append(jsonKey).append("\":");

                    if (value instanceof String) {
                        json.append("\"").append(value).append("\"");
                    } else {
                        json.append(value);
                    }

                    json.append(",");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        // Remove last comma
        if (json.charAt(json.length() - 1) == ',') {
            json.deleteCharAt(json.length() - 1);
        }

        json.append("}");
        return json.toString();
    }
}
