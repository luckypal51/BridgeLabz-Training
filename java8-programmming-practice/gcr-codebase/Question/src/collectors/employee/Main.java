package collectors.employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Main {
      public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee(101,"Lucky","IT",45000));
		emp.add(new Employee(102,"Himesh","HR",15000));
		emp.add(new Employee(103,"Nageshwar","IT",7000));
		emp.add(new Employee(104,"Arvind","HR",48000));
		
		HashMap<String,Double>map = (HashMap<String,Double>)emp.stream().collect(Collectors.groupingBy(s->s.dept,Collectors.averagingDouble(s->s.salary)));
		for(var a:map.entrySet()) {
			System.out.println(a.getKey()+" Average Salary is : "+a.getValue());
		}
		
	}
}
