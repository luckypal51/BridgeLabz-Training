package lamda.employee;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee(101,"Lucky",150000));
		emp.add(new Employee(102,"himesh",250000));
		emp.add(new Employee(103,"nageshwar",1500000));
		
		emp.stream().map(x->x.emp_name).map(String::toUpperCase).forEach(System.out::println);
	}
}
