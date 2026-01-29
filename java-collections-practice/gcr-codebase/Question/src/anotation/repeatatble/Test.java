package anotation.repeatatble;


public class Test {
	@BugReports(report = "Array Index Out Of Bound")
	@BugReports
    public void case1() {
    	System.out.println("Testing...");
    }
}
