package anotation.role;

@RoleAllowed("ADMIN")
public class AdminService {

    public void deleteUser() {
        System.out.println("User deleted successfully!");
    }

    public void viewLogs() {
        System.out.println("System logs viewed!");
    }
}
