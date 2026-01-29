package reflection.executiontime;

public class Main {
	public static void main(String[] args) throws Exception {

        MathOperations math = new MathOperations();

        MethodTimer.measureExecutionTime(math, "add", 10, 20);
        MethodTimer.measureExecutionTime(math, "multiply", 5, 6);
    }
}
