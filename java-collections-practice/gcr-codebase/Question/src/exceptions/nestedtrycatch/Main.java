package exceptions.nestedtrycatch;

public class Main {
    public static void main(String[] args) {
    	try {
    		int [] arr= {0,2,3};
            int n = arr[0];
            try {
            	n=5/n;
            }catch(ArithmeticException e) {
            	System.out.println(e.getMessage());
            }
    	}catch(ArrayIndexOutOfBoundsException e) {
    		System.out.println(e.getMessage());
    	}
    }
}
