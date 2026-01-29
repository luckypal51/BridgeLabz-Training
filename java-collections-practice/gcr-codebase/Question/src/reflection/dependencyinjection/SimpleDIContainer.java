package reflection.dependencyinjection;

import java.lang.reflect.Field;

public class SimpleDIContainer {

   
    public static <T> T getInstance(Class<T> clazz) throws Exception {

       
        T obj = clazz.getDeclaredConstructor().newInstance();

       
        for (Field field : clazz.getDeclaredFields()) {

            if (field.isAnnotationPresent(Inject.class)) {

                Class<?> dependencyClass = field.getType();
                Object dependency = getInstance(dependencyClass); 

                field.setAccessible(true);
                field.set(obj, dependency);
            }
        }

        return obj;
    }
}
