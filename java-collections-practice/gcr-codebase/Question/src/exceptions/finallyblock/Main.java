package exceptions.finallyblock;

public class Main {
    public static void main(String[] args) {
    	try {
    		for(int i = 1;i<100;i++) {
    			int k =4/i;
    		}
    	}catch(ArithmeticException e) {
    		System.out.println(e.getMessage());
    	}finally {
    		System.out.println("Operation Complete");
    	}
    }
}
