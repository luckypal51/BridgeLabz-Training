package functionalinterface.PaymentMethod;

public class Wallet {
    public Payment pay;
    
    public Wallet() {
    	pay = (x)->System.out.println("Pay By Wallet : "+x);
    }
}
