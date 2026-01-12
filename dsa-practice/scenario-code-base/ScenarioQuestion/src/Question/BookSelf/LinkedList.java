package Question.BookSelf;

public class LinkedList {
     Node head;
     
     public void add(String name,String author,double price) {
    	 Node node = new Node(name,author,price);
    	 if(head==null) {
    		 head = node;
    		 System.out.println("Book Added SuccessFully "+node.name);
    		 return;
    	 }
    	 Node cur = head;
    	 while(cur.next!=null) {
    		 cur = cur.next;
    	 }
    	 cur.next = node;
    	 System.out.println("Book Added SuccessFully "+node.name);
     }
     
     public void delete(String name) {
    	 if(head==null) {
    		 System.out.println("The List is empty");
    		 return;
    	 }
    	 Node cur = head;
    	 Node perv = null;
    	 while(cur!=null) {
    		 if(cur.name.equalsIgnoreCase(name)) {
    			 if(perv==null) {
    				 head = cur.next;
    				 System.out.println("Successfully deleted");
    				 return;
    			 }else {
    				 perv.next = cur.next;
    				 System.out.println("Successfully deleted");
    				 return;
    			 }
    		 }
    		 perv = cur;
    		 cur = cur.next;
    		 
    	 }
    	 System.out.println("Book not Found");
     }
     public void view() {
        if(head==null) {
        	System.out.println("List Is Empty !");
        	return;
        }
        Node node = head;
        while(node!=null) {
       	 System.out.println("-------Book details--------");
    	 System.out.println("Book Name   : "+node.name);
    	 System.out.println("Author Name : "+node.author);
    	 System.out.println("Price       : "+node.price);
    	 node = node.next;
        }
     }
}
