package reflection.executiontime;

public class MathOperations {

    public void add(int a, int b) {
        try { Thread.sleep(50); } catch (InterruptedException e) {}
        System.out.println("Add: " + (a + b));
    }

    public void multiply(int a, int b) {
        try { Thread.sleep(100); } catch (InterruptedException e) {}
        System.out.println("Multiply: " + (a * b));
    }
}
