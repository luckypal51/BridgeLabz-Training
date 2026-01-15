package Question.CallCentre;
import java.util.*;

class CallCenter {

    private Queue<Customer> normalQueue = new LinkedList<>();

    private PriorityQueue<Customer> vipQueue =
            new PriorityQueue<>((a, b) -> a.customerId.compareTo(b.customerId));

    private HashMap<String, Integer> callFrequency = new HashMap<>();
   
    public void addCall(Customer customer) {

        
        callFrequency.put(
                customer.customerId,
                callFrequency.getOrDefault(customer.customerId, 0) + 1
        );

      
        if (customer.isVIP) {
            vipQueue.offer(customer);
            System.out.println("VIP call added: " + customer.name);
        } else {
            normalQueue.offer(customer);
            System.out.println("Normal call added: " + customer.name);
        }
    }
    public void handleNextCall() {

        if (!vipQueue.isEmpty()) {
            Customer c = vipQueue.poll();
            System.out.println("Handling VIP customer: " + c.name);
        }
        else if (!normalQueue.isEmpty()) {
            Customer c = normalQueue.poll();
            System.out.println("Handling normal customer: " + c.name);
        }
        else {
            System.out.println("No calls waiting.");
        }
    }
    public void showCallStats() {
        System.out.println("\nCustomer Call Frequency:");
        for (Map.Entry<String, Integer> entry : callFrequency.entrySet()) {
            System.out.println("Customer ID: " + entry.getKey()
                    + " | Calls: " + entry.getValue());
        }
    }

}