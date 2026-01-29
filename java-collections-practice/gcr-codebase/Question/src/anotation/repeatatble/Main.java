package anotation.repeatatble;

import java.lang.reflect.Method;


public class Main {
   public static void main(String[] args) throws NoSuchMethodException, SecurityException {
	    Method method = Test.class.getDeclaredMethod("case1");

        BugReports[] bugs = method.getAnnotationsByType(BugReports.class);

        for (BugReports bug : bugs) {
            System.out.println("Bug: " + bug.report());
   }
}
}