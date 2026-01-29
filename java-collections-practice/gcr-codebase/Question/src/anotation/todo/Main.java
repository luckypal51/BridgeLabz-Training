package anotation.todo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {
   public static void main(String[] args) {
	   Demo d = new Demo();
	   Class<? extends Demo> c = d.getClass();
	   Annotation an = c.getAnnotation(Task.class);
	   Method [] method = c.getDeclaredMethods();
	   for (Method m : method) {
           if (m.isAnnotationPresent(Task.class)) {

               Task task = m.getAnnotation(Task.class);

               System.out.println("Method Name: " + m.getName());
               System.out.println("Description: " + task.description());
               System.out.println("Assigned To: " + task.assignedTo());
               System.out.println("Priority: " + task.priority());
               System.out.println("----------------------");
           }
       }
   }
}
