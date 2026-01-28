package exceptions.throwsvsthrow;

public class Main {
	public static void main(String[] args) {
		try {
			calculateInterest(1, -5, 4);
		}catch(Exception e) {
			System.out.println("Main method");
		}
	}
	
	public static void calculateInterest(int p, int r, int t) throws IllegalArgumentException{
		if(p<0||r<0) {
			throw new IllegalArgumentException("fields can't be negative");
		}else {
			System.out.println(p*r*t);
		}
	
	}
}
