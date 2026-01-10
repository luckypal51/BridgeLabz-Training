package Questions.SkillForge;

public class Main {
	 public static void main(String[] args) {

	        Instructor inst = new Instructor("lucky", "pallucky936@gmail.com");
	        Student stu = new Student("Nageshwar", "nageshwar@gmail.com");

	        Course course = new BeginnerCourse("Java Basics", inst);

	        stu.updateProgress(50);
	        stu.updateProgress(50);

	        stu.generateCertificate();      
	        ((ICertifiable) course).generateCertificate(); 
	    }
}
