package lamda.employee;

public class Employee {
     public int id;
     public String emp_name;
     public double salary;
     
	 public Employee(int id, String emp_name, double salary) {
		this.id = id;
		this.emp_name = emp_name;
		this.salary = salary;
	 }

	 @Override
	 public String toString() {
		return "Employee [id=" + id + ", emp_name=" + emp_name + ", salary=" + salary + "]";
	 }
}
