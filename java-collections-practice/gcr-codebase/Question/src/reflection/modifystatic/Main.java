package reflection.modifystatic;

import java.lang.reflect.Field;

public class Main {
	public static void main(String[] args) throws Exception {
        Class<?> cls = Configuration.class;
        Field field = cls.getDeclaredField("API_KEY");
        field.setAccessible(true); 
        System.out.println("Before Modification = " + field.get(null));;
        field.set(null, "654321");
        System.out.println("Modified API_KEY = " + field.get(null));
        Configuration.showKey();
    }
}
