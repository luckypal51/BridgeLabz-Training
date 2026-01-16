package Question.HospitalQueueSorting;

public class Queue {
     Patient head;
     
     public void add(Patient node) {
    	 if(head==null) {
    		 head= node;
    		 return;
    	 }
    	 Patient cur = head;
    	 while(cur.next!=null) {
    		 cur = cur.next;
    	 }
    	 cur.next = node;
     }
     
     public void poll() {
    	 if(head==null) {
    		 System.out.println("The list is empty");
    		 return;
    	 }
    	  head = head.next;
     }
     
     public void bubbleSort() {
    	    if (head == null || head.next == null) {
    	        return; 
    	    }

    	    boolean swapped;

    	    do {
    	        swapped = false;
    	        Patient cur = head;

    	        while (cur.next != null) {
    	            if (cur.priority > cur.next.priority) {
    	                // swap data
    	                int temp = cur.priority;
    	                cur.priority = cur.next.priority;
    	                cur.next.priority = temp;

    	                swapped = true;
    	            }
    	            cur = cur.next;
    	        }
    	    } while (swapped);
    	}
 
}
