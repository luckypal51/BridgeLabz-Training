package anotation.prioritycustomanotation;
import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) {
	     TaskInfo task = new TaskInfo();
	        Class<?> c = task.getClass();

	        Method[] methods = c.getDeclaredMethods();

	        for (Method method : methods) {
	            if (method.isAnnotationPresent(Priority.class)) {

	                Priority p = method.getAnnotation(Priority.class);

	                System.out.println(
	                        method.getName() + "-> Priority = " + p.priority()
	                );
	            }
	        }
	}
}
