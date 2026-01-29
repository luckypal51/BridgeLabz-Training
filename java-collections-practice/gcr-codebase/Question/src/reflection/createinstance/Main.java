package reflection.createinstance;

public class Main {
     public static void main(String[] args) throws Exception {
		Class<?> cl = Class.forName("reflection.createinstance.Student");
		
		Object obj = cl.getDeclaredConstructor().newInstance();
		Student stu = (Student) obj;
		stu.show();
	}
}
