package functionalinterface.refund;

class PaypalPayment implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund of " + amount + " processed via PayPal");
    }
}
