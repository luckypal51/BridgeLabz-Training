package reflection.dependencyinjection;

public class Main {
	 public static void main(String[] args) throws Exception {
      UserController controller = SimpleDIContainer.getInstance(UserController.class);
      controller.process();
	    }
}
