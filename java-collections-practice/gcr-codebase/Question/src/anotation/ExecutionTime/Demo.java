package anotation.ExecutionTime;
public class Demo {

    @LogExecutionTime
    public void slowMethod() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Slow method executed");
    }

    @LogExecutionTime
    public void fastMethod() throws InterruptedException {
        Thread.sleep(100); 
        System.out.println("Fast method executed");
    }

    public void normalMethod() {
        System.out.println("Normal method executed");
    }
}
