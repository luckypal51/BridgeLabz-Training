package exceptions.customexception;

public class Main {
   public static void main(String[] args) {
	   try {
		verifyAge(17);
	   } catch (InvalidAge e) {
		 System.out.println(e.getMessage());
	   }
   }
   public static void verifyAge(int a) throws InvalidAge {
	   if(a<18) {
		    throw new InvalidAge("Age is not valid for voting");
	   }
   }
}
