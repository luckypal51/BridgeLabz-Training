package anotation.role;
public class Main {
    public static void main(String[] args) {

        AdminService service = new AdminService();
        UserContext.setRole("USER");
        System.out.println("Current Role: USER");
        SecurityManager.invokeMethod(service, "deleteUser");

        System.out.println("-------------------");

        UserContext.setRole("ADMIN");
        System.out.println("Current Role: ADMIN");
        SecurityManager.invokeMethod(service, "deleteUser");
    }
}
