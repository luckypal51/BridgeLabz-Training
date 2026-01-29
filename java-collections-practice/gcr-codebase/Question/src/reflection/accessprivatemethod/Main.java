package reflection.accessprivatemethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
     public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
	     Demo d = new Demo();
	     Class<?> cl = d.getClass();

	        Method method = cl.getDeclaredMethod("multiply",int.class, int.class);
            method.setAccessible(true);
	        method.invoke(d, 10, 30);

	       
    }
}
