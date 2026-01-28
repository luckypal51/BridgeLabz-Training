package exceptions.multiplecatch;

public class Main {
	public static void main(String[] args) {
		try {
			int[] arr = null;
			String [] str = new String[2];
			String a = str[5];
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
}
