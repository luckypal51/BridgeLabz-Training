package anotation.methodImportance;

import java.lang.reflect.Method;

public class Main {
    public static void main(String [] args) {
    	   Demo task = new Demo();
	        Class<?> c = task.getClass();

	        Method[] methods = c.getDeclaredMethods();

	        for (Method method : methods) {
	            if (method.isAnnotationPresent(ImprotantMethod.class)) {

	            	ImprotantMethod p = method.getAnnotation(ImprotantMethod.class);

	                System.out.println(
	                        method.getName() + "-> Priority = " + p.imp()
	                );
	            }
	        }
    }
}
