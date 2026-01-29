package reflection.executiontime;

import java.lang.reflect.Method;

public class MethodTimer {

    public static void measureExecutionTime(Object obj, String methodName, Object... args) throws Exception {

        Class<?> cls = obj.getClass();

        Class<?>[] paramTypes = new Class[args.length];
        for (int i = 0; i < args.length; i++) {
            paramTypes[i] = args[i].getClass();
            
            if (paramTypes[i] == Integer.class) paramTypes[i] = int.class;
            if (paramTypes[i] == Double.class) paramTypes[i] = double.class;
            if (paramTypes[i] == Float.class) paramTypes[i] = float.class;
        }

        Method method = cls.getMethod(methodName, paramTypes);
        long start = System.nanoTime();
        method.invoke(obj, args);
        long end = System.nanoTime();

        System.out.println("Execution time of " + methodName + " = " + (end - start) + " ns");
    }
}
