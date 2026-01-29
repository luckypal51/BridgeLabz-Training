package anotation.ExecutionTime;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {

        Demo d = new Demo();
        Class<?> c = d.getClass();
        Method[] methods = c.getDeclaredMethods();
        for (Method m : methods) {
            if (m.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.nanoTime();   
                m.invoke(d);                     
                long end = System.nanoTime();    
                long timeTaken = end - start;
                System.out.println("Method: " + m.getName() +" | Execution Time: " + timeTaken + " ns" );
                System.out.println("-----------------------------");
            }
        }
    }
}
