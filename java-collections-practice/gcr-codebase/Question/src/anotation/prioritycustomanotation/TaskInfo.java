package anotation.prioritycustomanotation;

public class TaskInfo {
    @Priority(priority = 1)
	public void task1() {
		System.out.println("Task 1");
	}
    
    @Priority(priority = 10)
   	public void task2() {
   		System.out.println("Task 2");
   	}
       
    @Priority
   	public void task3() {
   		System.out.println("Task 3");
   	}
       
    
}
