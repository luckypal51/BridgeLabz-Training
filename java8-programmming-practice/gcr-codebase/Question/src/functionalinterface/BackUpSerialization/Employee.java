package functionalinterface.BackUpSerialization;

public class Employee implements BackUpSerialization{

	public int id;
	public String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
