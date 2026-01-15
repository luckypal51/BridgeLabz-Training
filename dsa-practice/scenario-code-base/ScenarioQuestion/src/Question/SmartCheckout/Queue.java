package Question.SmartCheckout;

public class Queue {
    public Node head;
    
    public boolean isEmpty() {
    	if(head==null) {
    		return true;
    	}
    	return false;
    }
    
    public void addCustomer(Node node) {
    	if(head==null) {
    		head = node;
    		System.out.println("\nSuccessFully added Customer "+node.name);
    		return;
    	}
    	Node cur = head;
    	while(cur.next!=null) {
    		cur = cur.next;
    	}
    	cur.next = node;
    	System.out.println("\nSuccessFully added Customer "+node.name);
		return;
    }
    
    public void checkoutCustomer() {
    	if(isEmpty()) {
    		System.out.println("No Customer Available!!!");
    		return;
    	}
    	System.out.println("\n-----Bill------");
    	System.out.println("Name    : "+head.name);
        head.viewCart();
        System.out.println("------------------");
        System.out.println("Total   : "+head.totalprice());
        System.out.println("------------------");
        head = head.next;
    }
}
