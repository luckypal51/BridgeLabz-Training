package anotation.todo;

public class Demo {
   
	@Task(description = "create cart",assignedTo = "Lucky",priority = Priority.HIGH)
	public void task1() {
		
	}
	@Task(description = "create payment",assignedTo = "Himesh",priority = Priority.LOW)
    public void task2() {
		
	}
	@Task(description = "deploy",assignedTo = "Nageshwar",priority = Priority.MEDIUM)
    public void task3() {
	
    }

}
