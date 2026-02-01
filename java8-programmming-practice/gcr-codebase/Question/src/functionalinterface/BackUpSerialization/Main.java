package functionalinterface.BackUpSerialization;

public class Main {
     public static void main(String[] args) {
		BackUpProcess backup = new BackUpProcess();
		backup.backUp(new Employee(101,"Lucky"));
		backup.backUp(new Student(450,"Himesh"));
	}
}
