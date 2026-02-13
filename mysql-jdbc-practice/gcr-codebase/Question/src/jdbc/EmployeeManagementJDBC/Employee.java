package jdbc.EmployeeManagementJDBC;

public class Employee {
     private int id;
     private String name;
     private double salary;
     private String contact;
     private String email;
	 public Employee(int id, String name, double salary, String contact, String email) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.contact = contact;
		this.email = email;
	 }
	 public int getId() {
		 return id;
	 }
	 public void setId(int id) {
		 this.id = id;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public double getSalary() {
		 return salary;
	 }
	 public void setSalary(double salary) {
		 this.salary = salary;
	 }
	 public String getContact() {
		 return contact;
	 }
	 public void setContact(String contact) {
		 this.contact = contact;
	 }
	 public String getEmail() {
		 return email;
	 }
	 public void setEmail(String email) {
		 this.email = email;
	 }
	 @Override
	 public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", contact=" + contact + ", email="
				+ email + "]";
	 }
     
     
}
