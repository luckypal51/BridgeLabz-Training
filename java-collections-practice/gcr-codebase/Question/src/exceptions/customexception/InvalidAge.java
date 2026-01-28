package exceptions.customexception;

public class InvalidAge extends Exception{
	private static final long serialVersionUID = 1L;
   public InvalidAge(String s) {
	   super(s);
   }
}
