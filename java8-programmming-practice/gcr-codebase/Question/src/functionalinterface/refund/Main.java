package functionalinterface.refund;

public class Main {
	  public static void main(String[] args) {

	        PaymentProcessor cc = new CreditCardPayment();
	        cc.pay(1000);
	        cc.refund(200);

	        PaymentProcessor paypal = new PaypalPayment();
	        paypal.pay(2000);
	        paypal.refund(500);
	    }
}
