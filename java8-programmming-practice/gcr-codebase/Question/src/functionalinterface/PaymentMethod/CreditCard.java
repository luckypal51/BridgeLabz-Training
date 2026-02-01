package functionalinterface.PaymentMethod;

public class CreditCard {
   public Payment pay;
   
   public CreditCard() {
	   pay = (x)->{System.out.println("Pay By Credit Card : "+x);};
   }
}
