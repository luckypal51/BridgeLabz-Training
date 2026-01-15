package Question.CallCentre;

public class Main {
    public static void main(String[] args) {
    CallCenter center = new CallCenter();

    Customer c1 = new Customer("C101", "Ravi", false);
    Customer c2 = new Customer("C102", "Anita", true);
    Customer c3 = new Customer("C103", "Kiran", false);
    Customer c4 = new Customer("C102", "Anita", true);

    center.addCall(c1);
    center.addCall(c2);
    center.addCall(c3);
    center.addCall(c4);

    center.handleNextCall();
    center.handleNextCall();
    center.handleNextCall();

    center.showCallStats();
}
}
