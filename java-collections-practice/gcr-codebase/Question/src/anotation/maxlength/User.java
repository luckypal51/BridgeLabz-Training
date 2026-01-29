package anotation.maxlength;

import java.lang.reflect.Field;

public class User {

    @MaxLength(10)
    private String username;

    public User(String username) {
        this.username = username;
        validate();
    }

    private void validate() {
        try {
            Field field = this.getClass().getDeclaredField("username");
            MaxLength maxLength = field.getAnnotation(MaxLength.class);

            if (maxLength != null) {
                int limit = maxLength.value();
                if (username.length() > limit) {
                    throw new IllegalArgumentException(
                            "Username length exceeds max limit of " + limit
                    );
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }
}
