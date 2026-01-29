package anotation.role;

public class SecurityManager {

    public static void invokeMethod(Object obj, String methodName) {
        try {
            Class<?> c = obj.getClass();
            if (c.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed roleAllowed = c.getAnnotation(RoleAllowed.class);
                String requiredRole = roleAllowed.value();

                String userRole = UserContext.getRole();

                if (!requiredRole.equals(userRole)) {
                    System.out.println("Access Denied!");
                    return;
                }
            }
            c.getMethod(methodName).invoke(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
