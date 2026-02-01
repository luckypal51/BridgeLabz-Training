package functionalinterface.refund;

interface PaymentProcessor {

    void pay(double amount);

    // New feature added later
    default void refund(double amount) {
        System.out.println("Refund of " + amount + " processed (default)");
    }
}
