package functionalinterface.PaymentMethod;

public class UPI {
	public Payment pay;
   public UPI() {
	   pay = (x)->{System.out.println("Pay By UPI : "+x);};
   }
}
