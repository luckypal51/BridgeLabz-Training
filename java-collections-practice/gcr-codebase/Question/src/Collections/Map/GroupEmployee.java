package Collections.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupEmployee {
	public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> map = new HashMap<>();

        for (Employee emp : employees) {
            map.computeIfAbsent(emp.getDepartment(), k -> new ArrayList<>())
               .add(emp);
        }

        map.forEach((dept, empList) -> {
            System.out.println(dept + " : " +
                empList.stream().map(Employee::getName).toList());
        });
    }
}
