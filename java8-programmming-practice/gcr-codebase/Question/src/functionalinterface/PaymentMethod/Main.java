package functionalinterface.PaymentMethod;

public class Main {
    public static void main(String[] args) {
		UPI upi = new UPI();
		CreditCard card = new CreditCard();
		Wallet wallet = new Wallet();
		
		upi.pay.pay(1000);
		card.pay.pay(500);
		wallet.pay.pay(15000);
	}
}
