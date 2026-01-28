package exceptions.propogation;

public class Main {
   public static void main(String[] args) {
	   try {
		   method1();
	   }catch(ArithmeticException e) {
		   System.out.println(e.getMessage());
	   }
   }
   public static void method1() {
	   method2();
   }
   public static void method2() {
	   throw new ArithmeticException("Exception accures");
   }
}
